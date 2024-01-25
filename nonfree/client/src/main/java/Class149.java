import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ip")
public final class Class149 {

	@OriginalMember(owner = "client!ip", name = "g", descriptor = "J")
	private long aLong133;

	@OriginalMember(owner = "client!ip", name = "n", descriptor = "I")
	private int anInt4072;

	@OriginalMember(owner = "client!ip", name = "v", descriptor = "J")
	private long aLong137 = -1L;

	@OriginalMember(owner = "client!ip", name = "i", descriptor = "J")
	private long aLong134 = -1L;

	@OriginalMember(owner = "client!ip", name = "p", descriptor = "I")
	private int anInt4074 = 0;

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "Lclient!fca;")
	private final Class97 aClass97_4;

	@OriginalMember(owner = "client!ip", name = "k", descriptor = "J")
	private long aLong135;

	@OriginalMember(owner = "client!ip", name = "w", descriptor = "J")
	private long aLong138;

	@OriginalMember(owner = "client!ip", name = "e", descriptor = "[B")
	private final byte[] aByteArray52;

	@OriginalMember(owner = "client!ip", name = "j", descriptor = "[B")
	private final byte[] aByteArray53;

	@OriginalMember(owner = "client!ip", name = "s", descriptor = "J")
	private long aLong136;

	static {
		new Class40("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
	}

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lclient!fca;II)V")
	public Class149(@OriginalArg(0) Class97 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass97_4 = arg0;
		this.aLong138 = this.aLong135 = arg0.method2500();
		this.aByteArray52 = new byte[arg2];
		this.aByteArray53 = new byte[arg1];
		this.aLong136 = 0L;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)V")
	private void method3473() throws IOException {
		if (this.aLong137 == -1L) {
			return;
		}
		if (this.aLong137 != this.aLong133) {
			this.aClass97_4.method2496(this.aLong137);
			this.aLong133 = this.aLong137;
		}
		this.aClass97_4.method2497(this.aByteArray52, 0, this.anInt4074);
		this.aLong133 += this.anInt4074;
		if (this.aLong135 < this.aLong133) {
			this.aLong135 = this.aLong133;
		}
		@Pc(57) long local57 = -1L;
		@Pc(59) long local59 = -1L;
		if (this.aLong134 <= this.aLong137 && (long) this.anInt4072 + this.aLong134 > this.aLong137) {
			local57 = this.aLong137;
		} else if (this.aLong134 >= this.aLong137 && (long) this.anInt4074 + this.aLong137 > this.aLong134) {
			local57 = this.aLong134;
		}
		if (this.aLong134 < (long) this.anInt4074 + this.aLong137 && (long) this.anInt4072 + this.aLong134 >= (long) this.anInt4074 + this.aLong137) {
			local59 = (long) this.anInt4074 + this.aLong137;
		} else if (this.aLong134 + (long) this.anInt4072 > this.aLong137 && this.aLong134 + (long) this.anInt4072 <= this.aLong137 - -((long) this.anInt4074)) {
			local59 = (long) this.anInt4072 + this.aLong134;
		}
		if (local57 > -1L && local57 < local59) {
			@Pc(198) int local198 = (int) (local59 - local57);
			Static553.method2534(this.aByteArray52, (int) (local57 - this.aLong137), this.aByteArray53, (int) (local57 - this.aLong134), local198);
		}
		this.aLong137 = -1L;
		this.anInt4074 = 0;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(I[BII)V")
	public void method3474(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if ((long) arg2 + this.aLong136 > this.aLong138) {
				this.aLong138 = this.aLong136 + (long) arg2;
			}
			if (this.aLong137 != -1L && (this.aLong137 > this.aLong136 || this.aLong137 + (long) this.anInt4074 < this.aLong136)) {
				this.method3473();
			}
			if (this.aLong137 != -1L && this.aLong136 + (long) arg2 > (long) this.aByteArray52.length + this.aLong137) {
				@Pc(102) int local102 = (int) ((long) this.aByteArray52.length + this.aLong137 - this.aLong136);
				Static553.method2534(arg1, arg0, this.aByteArray52, (int) (this.aLong136 - this.aLong137), local102);
				arg0 += local102;
				this.aLong136 += local102;
				arg2 -= local102;
				this.anInt4074 = this.aByteArray52.length;
				this.method3473();
			}
			if (this.aByteArray52.length < arg2) {
				if (this.aLong133 != this.aLong136) {
					this.aClass97_4.method2496(this.aLong136);
					this.aLong133 = this.aLong136;
				}
				this.aClass97_4.method2497(arg1, arg0, arg2);
				this.aLong133 += arg2;
				if (this.aLong135 < this.aLong133) {
					this.aLong135 = this.aLong133;
				}
				@Pc(189) long local189 = -1L;
				if (this.aLong134 <= this.aLong136 && this.aLong134 + (long) this.anInt4072 > this.aLong136) {
					local189 = this.aLong136;
				} else if (this.aLong134 >= this.aLong136 && this.aLong136 + (long) arg2 > this.aLong134) {
					local189 = this.aLong134;
				}
				@Pc(239) long local239 = -1L;
				if (this.aLong134 < (long) arg2 + this.aLong136 && (long) arg2 + this.aLong136 <= (long) this.anInt4072 + this.aLong134) {
					local239 = this.aLong136 + (long) arg2;
				} else if ((long) this.anInt4072 + this.aLong134 > this.aLong136 && (long) arg2 + this.aLong136 >= this.aLong134 + (long) this.anInt4072) {
					local239 = this.aLong134 + (long) this.anInt4072;
				}
				if (local189 > -1L && local189 < local239) {
					@Pc(323) int local323 = (int) (local239 - local189);
					Static553.method2534(arg1, (int) (local189 + (long) arg0 - this.aLong136), this.aByteArray53, (int) (local189 - this.aLong134), local323);
				}
				this.aLong136 += arg2;
			} else if (arg2 > 0) {
				if (this.aLong137 == -1L) {
					this.aLong137 = this.aLong136;
				}
				Static553.method2534(arg1, arg0, this.aByteArray52, (int) (this.aLong136 - this.aLong137), arg2);
				this.aLong136 += arg2;
				if (this.aLong136 - this.aLong137 > (long) this.anInt4074) {
					this.anInt4074 = (int) (this.aLong136 - this.aLong137);
				}
			}
		} catch (@Pc(408) IOException local408) {
			this.aLong133 = -1L;
			throw local408;
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Z)V")
	private void method3476() throws IOException {
		this.anInt4072 = 0;
		if (this.aLong133 != this.aLong136) {
			this.aClass97_4.method2496(this.aLong136);
			this.aLong133 = this.aLong136;
		}
		this.aLong134 = this.aLong136;
		while (this.anInt4072 < this.aByteArray53.length) {
			@Pc(46) int local46 = this.aByteArray53.length - this.anInt4072;
			if (local46 > 200000000) {
				local46 = 200000000;
			}
			@Pc(61) int local61 = this.aClass97_4.method2501(this.aByteArray53, local46, this.anInt4072);
			if (local61 == -1) {
				break;
			}
			this.aLong133 += local61;
			this.anInt4072 += local61;
		}
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(I)J")
	public long method3477() {
		return this.aLong138;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)Ljava/io/File;")
	private File method3479() {
		return this.aClass97_4.method2498();
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "([BB)V")
	public void method3480(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method3482(0, arg0.length, arg0);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(JB)V")
	public void method3481(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method3479());
		}
		this.aLong136 = arg0;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(II[BI)V")
	public void method3482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		try {
			if (arg1 > arg2.length) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg2.length);
			}
			if (this.aLong137 != -1L && this.aLong136 >= this.aLong137 && (long) this.anInt4074 + this.aLong137 >= (long) arg1 + this.aLong136) {
				Static553.method2534(this.aByteArray52, (int) (this.aLong136 - this.aLong137), arg2, 0, arg1);
				this.aLong136 += arg1;
				return;
			}
			@Pc(76) long local76 = this.aLong136;
			@Pc(80) int local80 = arg1;
			@Pc(108) int local108;
			if (this.aLong136 >= this.aLong134 && this.aLong134 + (long) this.anInt4072 > this.aLong136) {
				local108 = (int) (this.aLong134 + (long) this.anInt4072 - this.aLong136);
				if (local108 > arg1) {
					local108 = arg1;
				}
				Static553.method2534(this.aByteArray53, (int) (this.aLong136 - this.aLong134), arg2, 0, local108);
				this.aLong136 += local108;
				arg0 = local108;
				arg1 -= local108;
			}
			if (this.aByteArray53.length < arg1) {
				this.aClass97_4.method2496(this.aLong136);
				this.aLong133 = this.aLong136;
				while (arg1 > 0) {
					local108 = this.aClass97_4.method2501(arg2, arg1, arg0);
					if (local108 == -1) {
						break;
					}
					arg1 -= local108;
					this.aLong136 += local108;
					this.aLong133 += local108;
					arg0 += local108;
				}
			} else if (arg1 > 0) {
				this.method3476();
				local108 = arg1;
				if (arg1 > this.anInt4072) {
					local108 = this.anInt4072;
				}
				Static553.method2534(this.aByteArray53, 0, arg2, arg0, local108);
				arg0 += local108;
				arg1 -= local108;
				this.aLong136 += local108;
			}
			if (this.aLong137 != -1L) {
				if (this.aLong136 < this.aLong137 && arg1 > 0) {
					local108 = arg0 + (int) (this.aLong137 - this.aLong136);
					if (arg1 + arg0 < local108) {
						local108 = arg0 + arg1;
					}
					while (arg0 < local108) {
						arg1--;
						arg2[arg0++] = 0;
						this.aLong136++;
					}
				}
				@Pc(299) long local299 = -1L;
				@Pc(301) long local301 = -1L;
				if (this.aLong137 >= local76 && this.aLong137 < local76 + (long) local80) {
					local299 = this.aLong137;
				} else if (local76 >= this.aLong137 && local76 < this.aLong137 + (long) this.anInt4074) {
					local299 = local76;
				}
				if (local76 < (long) this.anInt4074 + this.aLong137 && this.aLong137 + (long) this.anInt4074 <= local76 - -((long) local80)) {
					local301 = this.aLong137 + (long) this.anInt4074;
				} else if (local76 + (long) local80 > this.aLong137 && local76 + (long) local80 <= this.aLong137 + (long) this.anInt4074) {
					local301 = (long) local80 + local76;
				}
				if (local299 > -1L && local301 > local299) {
					@Pc(427) int local427 = (int) (local301 - local299);
					Static553.method2534(this.aByteArray52, (int) (local299 - this.aLong137), arg2, (int) (local299 - local76), local427);
					if (this.aLong136 < local301) {
						arg1 = (int) ((long) arg1 + this.aLong136 - local301);
						this.aLong136 = local301;
					}
				}
			}
		} catch (@Pc(470) IOException local470) {
			this.aLong133 = -1L;
			throw local470;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}
}
