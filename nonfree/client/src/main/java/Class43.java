import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class43 {

	@OriginalMember(owner = "client!je", name = "b", descriptor = "I")
	private int anInt1675 = 65000;

	@OriginalMember(owner = "client!je", name = "f", descriptor = "Lclient!v;")
	private Class80 aClass80_1 = null;

	@OriginalMember(owner = "client!je", name = "j", descriptor = "Lclient!v;")
	private Class80 aClass80_2 = null;

	@OriginalMember(owner = "client!je", name = "k", descriptor = "I")
	private final int anInt1679;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(ILclient!v;Lclient!v;I)V")
	public Class43(@OriginalArg(0) int arg0, @OriginalArg(1) Class80 arg1, @OriginalArg(2) Class80 arg2, @OriginalArg(3) int arg3) {
		this.aClass80_2 = arg1;
		this.anInt1679 = arg0;
		this.anInt1675 = arg3;
		this.aClass80_1 = arg2;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "([BIII)Z")
	public boolean method1293(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class80 local6 = this.aClass80_2;
		synchronized (this.aClass80_2) {
			if (arg2 < 0 || arg2 > this.anInt1675) {
				throw new IllegalArgumentException();
			}
			@Pc(31) boolean local31 = this.method1295(arg1, true, arg0, arg2);
			if (!local31) {
				local31 = this.method1295(arg1, false, arg0, arg2);
			}
			return local31;
		}
	}

	@OriginalMember(owner = "client!je", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt1679;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIZ[BI)Z")
	private boolean method1295(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class80 local8 = this.aClass80_2;
		synchronized (this.aClass80_2) {
			try {
				@Pc(70) int local70;
				if (arg1) {
					if ((long) (arg0 * 6 + 6) > this.aClass80_1.method2617()) {
						return false;
					}
					this.aClass80_1.method2608((long) (arg0 * 6));
					this.aClass80_1.method2614(6, Static149.aByteArray38, 0);
					local70 = ((Static149.aByteArray38[3] & 0xFF) << 16) + (((Static149.aByteArray38[4] & 0xFF) << 8) + (Static149.aByteArray38[5] & 0xFF));
					if (local70 <= 0 || (long) local70 > this.aClass80_2.method2617() / 520L) {
						return false;
					}
				} else {
					local70 = (int) ((this.aClass80_2.method2617() + 519L) / 520L);
					if (local70 == 0) {
						local70 = 1;
					}
				}
				Static149.aByteArray38[1] = (byte) (arg3 >> 8);
				Static149.aByteArray38[4] = (byte) (local70 >> 8);
				@Pc(124) int local124 = 0;
				Static149.aByteArray38[5] = (byte) local70;
				@Pc(131) int local131 = 0;
				Static149.aByteArray38[2] = (byte) arg3;
				Static149.aByteArray38[3] = (byte) (local70 >> 16);
				Static149.aByteArray38[0] = (byte) (arg3 >> 16);
				this.aClass80_1.method2608((long) (arg0 * 6));
				this.aClass80_1.method2616(6, 0, Static149.aByteArray38);
				while (local131 < arg3) {
					@Pc(174) int local174 = 0;
					@Pc(210) int local210;
					if (arg1) {
						this.aClass80_2.method2608((long) (local70 * 520));
						try {
							this.aClass80_2.method2614(8, Static149.aByteArray38, 0);
						} catch (@Pc(193) EOFException local193) {
							return true;
						}
						local210 = ((Static149.aByteArray38[0] & 0xFF) << 8) + (Static149.aByteArray38[1] & 0xFF);
						@Pc(216) int local216 = Static149.aByteArray38[7] & 0xFF;
						@Pc(230) int local230 = (Static149.aByteArray38[3] & 0xFF) + ((Static149.aByteArray38[2] & 0xFF) << 8);
						local174 = (Static149.aByteArray38[6] & 0xFF) + ((Static149.aByteArray38[5] & 0xFF) << 8) + ((Static149.aByteArray38[4] & 0xFF) << 16);
						if (arg0 != local210 || local230 != local124 || this.anInt1679 != local216) {
							return false;
						}
						if (local174 < 0 || this.aClass80_2.method2617() / 520L < (long) local174) {
							return false;
						}
					}
					local210 = arg3 - local131;
					if (local210 > 512) {
						local210 = 512;
					}
					if (local174 == 0) {
						local174 = (int) ((this.aClass80_2.method2617() + 519L) / 520L);
						arg1 = false;
						if (local174 == 0) {
							local174++;
						}
						if (local174 == local70) {
							local174++;
						}
					}
					Static149.aByteArray38[0] = (byte) (arg0 >> 8);
					Static149.aByteArray38[2] = (byte) (local124 >> 8);
					Static149.aByteArray38[7] = (byte) this.anInt1679;
					Static149.aByteArray38[1] = (byte) arg0;
					Static149.aByteArray38[3] = (byte) local124;
					if (arg3 - local131 <= 512) {
						local174 = 0;
					}
					Static149.aByteArray38[5] = (byte) (local174 >> 8);
					Static149.aByteArray38[4] = (byte) (local174 >> 16);
					Static149.aByteArray38[6] = (byte) local174;
					this.aClass80_2.method2608((long) (local70 * 520));
					local70 = local174;
					this.aClass80_2.method2616(8, 0, Static149.aByteArray38);
					this.aClass80_2.method2616(local210, local131, arg2);
					local131 += local210;
					local124++;
				}
				return true;
			} catch (@Pc(434) IOException local434) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(II)[B")
	public byte[] method1298(@OriginalArg(0) int arg0) {
		@Pc(8) Class80 local8 = this.aClass80_2;
		synchronized (this.aClass80_2) {
			try {
				if (this.aClass80_1.method2617() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass80_1.method2608((long) (arg0 * 6));
				this.aClass80_1.method2614(6, Static149.aByteArray38, 0);
				@Pc(66) int local66 = ((Static149.aByteArray38[0] & 0xFF) << 16) - (-((Static149.aByteArray38[1] & 0xFF) << 8) - (Static149.aByteArray38[2] & 0xFF));
				@Pc(88) int local88 = (Static149.aByteArray38[5] & 0xFF) + ((Static149.aByteArray38[3] & 0xFF) << 16) + ((Static149.aByteArray38[4] & 0xFF) << 8);
				if (local66 < 0 || this.anInt1675 < local66) {
					return null;
				} else if (local88 > 0 && (long) local88 <= this.aClass80_2.method2617() / 520L) {
					@Pc(124) int local124 = 0;
					@Pc(126) int local126 = 0;
					@Pc(129) byte[] local129 = new byte[local66];
					while (local66 > local124) {
						if (local88 == 0) {
							return null;
						}
						this.aClass80_2.method2608((long) (local88 * 520));
						@Pc(151) int local151 = local66 - local124;
						if (local151 > 512) {
							local151 = 512;
						}
						this.aClass80_2.method2614(local151 + 8, Static149.aByteArray38, 0);
						@Pc(179) int local179 = ((Static149.aByteArray38[2] & 0xFF) << 8) + (Static149.aByteArray38[3] & 0xFF);
						@Pc(193) int local193 = (Static149.aByteArray38[1] & 0xFF) + ((Static149.aByteArray38[0] & 0xFF) << 8);
						@Pc(199) int local199 = Static149.aByteArray38[7] & 0xFF;
						@Pc(221) int local221 = (Static149.aByteArray38[6] & 0xFF) + ((Static149.aByteArray38[5] & 0xFF) << 8) + ((Static149.aByteArray38[4] & 0xFF) << 16);
						if (local193 == arg0 && local126 == local179 && this.anInt1679 == local199) {
							if (local221 >= 0 && (long) local221 <= this.aClass80_2.method2617() / 520L) {
								for (@Pc(265) int local265 = 0; local265 < local151; local265++) {
									local129[local124++] = Static149.aByteArray38[local265 + 8];
								}
								local126++;
								local88 = local221;
								continue;
							}
							return null;
						}
						return null;
					}
					return local129;
				} else {
					return null;
				}
			} catch (@Pc(293) IOException local293) {
				return null;
			}
		}
	}
}
