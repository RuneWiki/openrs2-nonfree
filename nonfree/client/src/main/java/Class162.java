import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public final class Class162 {

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "J")
	private long aLong136;

	@OriginalMember(owner = "client!ni", name = "n", descriptor = "I")
	private int anInt4721;

	@OriginalMember(owner = "client!ni", name = "l", descriptor = "J")
	private long aLong138 = -1L;

	@OriginalMember(owner = "client!ni", name = "v", descriptor = "I")
	private int anInt4725 = 0;

	@OriginalMember(owner = "client!ni", name = "x", descriptor = "J")
	private long aLong140 = -1L;

	@OriginalMember(owner = "client!ni", name = "p", descriptor = "Lclient!me;")
	private final Class154 aClass154_4;

	@OriginalMember(owner = "client!ni", name = "t", descriptor = "J")
	private long aLong139;

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "J")
	private long aLong137;

	@OriginalMember(owner = "client!ni", name = "r", descriptor = "[B")
	private final byte[] aByteArray47;

	@OriginalMember(owner = "client!ni", name = "m", descriptor = "[B")
	private final byte[] aByteArray46;

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "J")
	private long aLong135;

	static {
		new Class242("Your friendlist is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
		new Class242("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lclient!me;II)V")
	public Class162(@OriginalArg(0) Class154 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass154_4 = arg0;
		this.aLong137 = this.aLong139 = arg0.method3331();
		this.aByteArray47 = new byte[arg1];
		this.aByteArray46 = new byte[arg2];
		this.aLong135 = 0L;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "([BZ)V")
	public void method3589(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method3593(arg0.length, 0, arg0);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)Ljava/io/File;")
	private File method3590() {
		return this.aClass154_4.method3334();
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V")
	private void method3591() throws IOException {
		if (this.aLong138 == -1L) {
			return;
		}
		if (this.aLong138 != this.aLong136) {
			this.aClass154_4.method3332(this.aLong138);
			this.aLong136 = this.aLong138;
		}
		this.aClass154_4.method3336(this.anInt4725, this.aByteArray46, 0);
		this.aLong136 += this.anInt4725;
		if (this.aLong139 < this.aLong136) {
			this.aLong139 = this.aLong136;
		}
		@Pc(63) long local63 = -1L;
		if (this.aLong140 <= this.aLong138 && this.aLong140 + (long) this.anInt4721 > this.aLong138) {
			local63 = this.aLong138;
		} else if (this.aLong138 <= this.aLong140 && this.aLong140 < (long) this.anInt4725 + this.aLong138) {
			local63 = this.aLong140;
		}
		@Pc(110) long local110 = -1L;
		if ((long) this.anInt4725 + this.aLong138 > this.aLong140 && (long) this.anInt4725 + this.aLong138 <= this.aLong140 + (long) this.anInt4721) {
			local110 = this.aLong138 + (long) this.anInt4725;
		} else if (this.aLong138 < (long) this.anInt4721 + this.aLong140 && (long) this.anInt4725 + this.aLong138 >= (long) this.anInt4721 + this.aLong140) {
			local110 = (long) this.anInt4721 + this.aLong140;
		}
		if (local63 > -1L && local110 > local63) {
			@Pc(200) int local200 = (int) (local110 - local63);
			Static457.method1215(this.aByteArray46, (int) (local63 - this.aLong138), this.aByteArray47, (int) (local63 - this.aLong140), local200);
		}
		this.anInt4725 = 0;
		this.aLong138 = -1L;
	}

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)V")
	private void method3592() throws IOException {
		this.anInt4721 = 0;
		if (this.aLong136 != this.aLong135) {
			this.aClass154_4.method3332(this.aLong135);
			this.aLong136 = this.aLong135;
		}
		this.aLong140 = this.aLong135;
		while (this.aByteArray47.length > this.anInt4721) {
			@Pc(41) int local41 = this.aByteArray47.length - this.anInt4721;
			if (local41 > 200000000) {
				local41 = 200000000;
			}
			@Pc(56) int local56 = this.aClass154_4.method3333(this.anInt4721, local41, this.aByteArray47);
			if (local56 == -1) {
				break;
			}
			this.anInt4721 += local56;
			this.aLong136 += local56;
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(II[BB)V")
	public void method3593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		try {
			if (arg0 > arg2.length) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg2.length);
			}
			if (this.aLong138 != -1L && this.aLong135 >= this.aLong138 && this.aLong138 + (long) this.anInt4725 >= (long) arg0 + this.aLong135) {
				Static457.method1215(this.aByteArray46, (int) (this.aLong135 - this.aLong138), arg2, 0, arg0);
				this.aLong135 += arg0;
				return;
			}
			@Pc(83) long local83 = this.aLong135;
			@Pc(87) int local87 = arg0;
			@Pc(121) int local121;
			if (this.aLong135 >= this.aLong140 && this.aLong135 < this.aLong140 + (long) this.anInt4721) {
				local121 = (int) (this.aLong140 + (long) this.anInt4721 - this.aLong135);
				if (arg0 < local121) {
					local121 = arg0;
				}
				Static457.method1215(this.aByteArray47, (int) (this.aLong135 - this.aLong140), arg2, 0, local121);
				arg1 = local121;
				this.aLong135 += local121;
				arg0 -= local121;
			}
			if (arg0 > this.aByteArray47.length) {
				this.aClass154_4.method3332(this.aLong135);
				this.aLong136 = this.aLong135;
				while (arg0 > 0) {
					local121 = this.aClass154_4.method3333(arg1, arg0, arg2);
					if (local121 == -1) {
						break;
					}
					this.aLong135 += local121;
					arg0 -= local121;
					arg1 += local121;
					this.aLong136 += local121;
				}
			} else if (arg0 > 0) {
				this.method3592();
				local121 = arg0;
				if (arg0 > this.anInt4721) {
					local121 = this.anInt4721;
				}
				Static457.method1215(this.aByteArray47, 0, arg2, arg1, local121);
				arg1 += local121;
				this.aLong135 += local121;
				arg0 -= local121;
			}
			if (this.aLong138 != -1L) {
				if (this.aLong138 > this.aLong135 && arg0 > 0) {
					local121 = (int) (this.aLong138 - this.aLong135) + arg1;
					if (local121 > arg0 + arg1) {
						local121 = arg0 + arg1;
					}
					while (arg1 < local121) {
						arg0--;
						arg2[arg1++] = 0;
						this.aLong135++;
					}
				}
				@Pc(301) long local301 = -1L;
				if (this.aLong138 >= local83 && this.aLong138 < (long) local87 + local83) {
					local301 = this.aLong138;
				} else if (this.aLong138 <= local83 && (long) this.anInt4725 + this.aLong138 > local83) {
					local301 = local83;
				}
				@Pc(345) long local345 = -1L;
				if (local83 < (long) this.anInt4725 + this.aLong138 && this.aLong138 + (long) this.anInt4725 <= local83 - -((long) local87)) {
					local345 = this.aLong138 + (long) this.anInt4725;
				} else if (this.aLong138 < local83 + (long) local87 && (long) local87 + local83 <= (long) this.anInt4725 + this.aLong138) {
					local345 = (long) local87 + local83;
				}
				if (local301 > -1L && local345 > local301) {
					@Pc(425) int local425 = (int) (local345 - local301);
					Static457.method1215(this.aByteArray46, (int) (local301 - this.aLong138), arg2, (int) (local301 - local83), local425);
					if (this.aLong135 < local345) {
						arg0 = (int) ((long) arg0 + this.aLong135 - local345);
						this.aLong135 = local345;
					}
				}
			}
		} catch (@Pc(463) IOException local463) {
			this.aLong136 = -1L;
			throw local463;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)J")
	public long method3597() {
		return this.aLong137;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(JI)V")
	public void method3598(@OriginalArg(0) long arg0) throws IOException {
		if ((long) 0 > arg0) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method3590());
		}
		this.aLong135 = arg0;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(BI[BI)V")
	public void method3599(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong137 < (long) arg2 + this.aLong135) {
				this.aLong137 = this.aLong135 + (long) arg2;
			}
			if (this.aLong138 != -1L && (this.aLong138 > this.aLong135 || (long) this.anInt4725 + this.aLong138 < this.aLong135)) {
				this.method3591();
			}
			if (this.aLong138 != -1L && (long) this.aByteArray46.length + this.aLong138 < this.aLong135 - -((long) arg2)) {
				@Pc(91) int local91 = (int) ((long) this.aByteArray46.length + this.aLong138 - this.aLong135);
				Static457.method1215(arg1, arg0, this.aByteArray46, (int) (this.aLong135 - this.aLong138), local91);
				this.aLong135 += local91;
				arg2 -= local91;
				arg0 += local91;
				this.anInt4725 = this.aByteArray46.length;
				this.method3591();
			}
			if (this.aByteArray46.length < arg2) {
				if (this.aLong136 != this.aLong135) {
					this.aClass154_4.method3332(this.aLong135);
					this.aLong136 = this.aLong135;
				}
				this.aClass154_4.method3336(arg2, arg1, arg0);
				this.aLong136 += arg2;
				if (this.aLong139 < this.aLong136) {
					this.aLong139 = this.aLong136;
				}
				@Pc(182) long local182 = -1L;
				if (this.aLong135 >= this.aLong140 && this.aLong135 < this.aLong140 + (long) this.anInt4721) {
					local182 = this.aLong135;
				} else if (this.aLong135 <= this.aLong140 && this.aLong140 < (long) arg2 + this.aLong135) {
					local182 = this.aLong140;
				}
				@Pc(232) long local232 = -1L;
				if (this.aLong140 < (long) arg2 + this.aLong135 && (long) arg2 + this.aLong135 <= this.aLong140 + (long) this.anInt4721) {
					local232 = this.aLong135 + (long) arg2;
				} else if (this.aLong135 < (long) this.anInt4721 + this.aLong140 && (long) arg2 + this.aLong135 >= this.aLong140 - -((long) this.anInt4721)) {
					local232 = (long) this.anInt4721 + this.aLong140;
				}
				if (local182 > -1L && local182 < local232) {
					@Pc(320) int local320 = (int) (local232 - local182);
					Static457.method1215(arg1, (int) ((long) arg0 + local182 - this.aLong135), this.aByteArray47, (int) (local182 - this.aLong140), local320);
				}
				this.aLong135 += arg2;
			} else if (arg2 > 0) {
				if (this.aLong138 == -1L) {
					this.aLong138 = this.aLong135;
				}
				Static457.method1215(arg1, arg0, this.aByteArray46, (int) (this.aLong135 - this.aLong138), arg2);
				this.aLong135 += arg2;
				if (this.aLong135 - this.aLong138 > (long) this.anInt4725) {
					this.anInt4725 = (int) (this.aLong135 - this.aLong138);
				}
			}
		} catch (@Pc(403) IOException local403) {
			this.aLong136 = -1L;
			throw local403;
		}
	}
}
