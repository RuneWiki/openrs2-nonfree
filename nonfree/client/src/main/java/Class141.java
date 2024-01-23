import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class141 {

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "Lclient!e;")
	private Class38 aClass38_4 = null;

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "Lclient!e;")
	private Class38 aClass38_3 = null;

	@OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
	private int anInt4211 = 65000;

	@OriginalMember(owner = "client!qe", name = "n", descriptor = "I")
	private int anInt4215;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(ILclient!e;Lclient!e;I)V")
	public Class141(@OriginalArg(0) int arg0, @OriginalArg(1) Class38 arg1, @OriginalArg(2) Class38 arg2, @OriginalArg(3) int arg3) {
		this.aClass38_3 = arg1;
		this.anInt4215 = arg0;
		this.aClass38_4 = arg2;
		this.anInt4211 = arg3;
	}

	@OriginalMember(owner = "client!qe", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt4215;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z[BBII)Z")
	private boolean method3623(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class38 local9 = this.aClass38_3;
		synchronized (this.aClass38_3) {
			try {
				@Pc(65) int local65;
				@Pc(25) boolean local25;
				if (arg0) {
					if (this.aClass38_4.method1036() < (long) (arg3 * 6 + 6)) {
						local25 = false;
						return local25;
					}
					this.aClass38_4.method1030((long) (arg3 * 6));
					this.aClass38_4.method1040(Static305.aByteArray186, 6, 0);
					local65 = (Static305.aByteArray186[5] & 0xFF) + ((Static305.aByteArray186[4] & 0xFF) << 8) + ((Static305.aByteArray186[3] & 0xFF) << 16);
					if (local65 <= 0 || (long) local65 > this.aClass38_3.method1036() / 520L) {
						local25 = false;
						return local25;
					}
				} else {
					local65 = (int) ((this.aClass38_3.method1036() + 519L) / 520L);
					if (local65 == 0) {
						local65 = 1;
					}
				}
				@Pc(109) int local109 = 0;
				Static305.aByteArray186[0] = (byte) (arg2 >> 16);
				Static305.aByteArray186[5] = (byte) local65;
				Static305.aByteArray186[2] = (byte) arg2;
				Static305.aByteArray186[3] = (byte) (local65 >> 16);
				Static305.aByteArray186[4] = (byte) (local65 >> 8);
				Static305.aByteArray186[1] = (byte) (arg2 >> 8);
				this.aClass38_4.method1030((long) (arg3 * 6));
				@Pc(163) int local163 = 0;
				this.aClass38_4.method1029(0, Static305.aByteArray186, 6);
				while (true) {
					if (arg2 > local109) {
						label134: {
							@Pc(179) int local179 = 0;
							@Pc(216) int local216;
							if (arg0) {
								this.aClass38_3.method1030((long) (local65 * 520));
								try {
									this.aClass38_3.method1040(Static305.aByteArray186, 8, 0);
								} catch (@Pc(200) EOFException local200) {
									break label134;
								}
								local216 = (Static305.aByteArray186[1] & 0xFF) + ((Static305.aByteArray186[0] & 0xFF) << 8);
								@Pc(230) int local230 = (Static305.aByteArray186[3] & 0xFF) + ((Static305.aByteArray186[2] & 0xFF) << 8);
								local179 = (Static305.aByteArray186[6] & 0xFF) + ((Static305.aByteArray186[4] & 0xFF) << 16) + ((Static305.aByteArray186[5] & 0xFF) << 8);
								@Pc(259) int local259 = Static305.aByteArray186[7] & 0xFF;
								if (local216 != arg3 || local230 != local163 || local259 != this.anInt4215) {
									local25 = false;
									return local25;
								}
								if (local179 < 0 || this.aClass38_3.method1036() / 520L < (long) local179) {
									local25 = false;
									return local25;
								}
							}
							if (local179 == 0) {
								arg0 = false;
								local179 = (int) ((this.aClass38_3.method1036() + 519L) / 520L);
								if (local179 == 0) {
									local179++;
								}
								if (local65 == local179) {
									local179++;
								}
							}
							Static305.aByteArray186[2] = (byte) (local163 >> 8);
							Static305.aByteArray186[3] = (byte) local163;
							if (arg2 - local109 <= 512) {
								local179 = 0;
							}
							Static305.aByteArray186[5] = (byte) (local179 >> 8);
							Static305.aByteArray186[0] = (byte) (arg3 >> 8);
							Static305.aByteArray186[6] = (byte) local179;
							Static305.aByteArray186[7] = (byte) this.anInt4215;
							Static305.aByteArray186[1] = (byte) arg3;
							Static305.aByteArray186[4] = (byte) (local179 >> 16);
							this.aClass38_3.method1030((long) (local65 * 520));
							local65 = local179;
							local216 = arg2 - local109;
							if (local216 > 512) {
								local216 = 512;
							}
							local163++;
							this.aClass38_3.method1029(0, Static305.aByteArray186, 8);
							this.aClass38_3.method1029(local109, arg1, local216);
							local109 += local216;
							continue;
						}
					}
					local25 = true;
					return local25;
				}
			} catch (@Pc(436) IOException local436) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "([BIIB)Z")
	public boolean method3625(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class38 local7 = this.aClass38_3;
		synchronized (this.aClass38_3) {
			if (arg2 < 0 || this.anInt4211 < arg2) {
				throw new IllegalArgumentException();
			}
			@Pc(36) boolean local36 = this.method3623(true, arg0, arg2, arg1);
			if (!local36) {
				local36 = this.method3623(false, arg0, arg2, arg1);
			}
			return local36;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)[B")
	public byte[] method3626(@OriginalArg(0) int arg0) {
		@Pc(15) Class38 local15 = this.aClass38_3;
		synchronized (this.aClass38_3) {
			try {
				@Pc(33) Object local33;
				if ((long) (arg0 * 6 + 6) > this.aClass38_4.method1036()) {
					local33 = null;
					return (byte[]) local33;
				}
				this.aClass38_4.method1030((long) (arg0 * 6));
				this.aClass38_4.method1040(Static305.aByteArray186, 6, 0);
				@Pc(73) int local73 = (Static305.aByteArray186[2] & 0xFF) + ((Static305.aByteArray186[1] & 0xFF) << 8) + ((Static305.aByteArray186[0] & 0xFF) << 16);
				@Pc(95) int local95 = (Static305.aByteArray186[5] & 0xFF) + ((Static305.aByteArray186[3] & 0xFF) << 16) + ((Static305.aByteArray186[4] & 0xFF) << 8);
				if (local73 < 0 || local73 > this.anInt4211) {
					local33 = null;
					return (byte[]) local33;
				} else if (local95 > 0 && this.aClass38_3.method1036() / 520L >= (long) local95) {
					@Pc(136) byte[] local136 = new byte[local73];
					@Pc(138) int local138 = 0;
					@Pc(140) int local140 = 0;
					while (local138 < local73) {
						if (local95 == 0) {
							local33 = null;
							return (byte[]) local33;
						}
						@Pc(160) int local160 = local73 - local138;
						this.aClass38_3.method1030((long) (local95 * 520));
						if (local160 > 512) {
							local160 = 512;
						}
						this.aClass38_3.method1040(Static305.aByteArray186, local160 + 8, 0);
						@Pc(196) int local196 = (Static305.aByteArray186[1] & 0xFF) + ((Static305.aByteArray186[0] & 0xFF) << 8);
						@Pc(219) int local219 = (Static305.aByteArray186[6] & 0xFF) + ((Static305.aByteArray186[4] & 0xFF) << 16) + ((Static305.aByteArray186[5] & 0xFF) << 8);
						@Pc(233) int local233 = ((Static305.aByteArray186[2] & 0xFF) << 8) + (Static305.aByteArray186[3] & 0xFF);
						@Pc(239) int local239 = Static305.aByteArray186[7] & 0xFF;
						if (local196 != arg0 || local233 != local140 || this.anInt4215 != local239) {
							local33 = null;
							return (byte[]) local33;
						}
						if (local219 < 0 || (long) local219 > this.aClass38_3.method1036() / 520L) {
							local33 = null;
							return (byte[]) local33;
						}
						local140++;
						local95 = local219;
						for (@Pc(290) int local290 = 0; local290 < local160; local290++) {
							local136[local138++] = Static305.aByteArray186[local290 + 8];
						}
					}
					@Pc(312) byte[] local312 = local136;
					return local312;
				} else {
					local33 = null;
					return (byte[]) local33;
				}
			} catch (@Pc(316) IOException local316) {
				return null;
			}
		}
	}
}
