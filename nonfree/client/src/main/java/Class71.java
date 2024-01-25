import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cr")
public final class Class71 {

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "Lclient!ho;")
	private Class151 aClass151_1 = null;

	@OriginalMember(owner = "client!cr", name = "m", descriptor = "I")
	private int anInt2050 = 65000;

	@OriginalMember(owner = "client!cr", name = "n", descriptor = "Lclient!ho;")
	private Class151 aClass151_2 = null;

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "I")
	private final int anInt2043;

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(ILclient!ho;Lclient!ho;I)V")
	public Class71(@OriginalArg(0) int arg0, @OriginalArg(1) Class151 arg1, @OriginalArg(2) Class151 arg2, @OriginalArg(3) int arg3) {
		this.aClass151_1 = arg2;
		this.anInt2043 = arg0;
		this.anInt2050 = arg3;
		this.aClass151_2 = arg1;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(II)[B")
	public byte[] method1858(@OriginalArg(0) int arg0) {
		@Pc(8) Class151 local8 = this.aClass151_2;
		synchronized (this.aClass151_2) {
			try {
				if (this.aClass151_1.method3654() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass151_1.method3649((long) (arg0 * 6));
				this.aClass151_1.method3647(Static315.aByteArray21, 6, 0);
				@Pc(70) int local70 = (Static315.aByteArray21[2] & 0xFF) + (((Static315.aByteArray21[0] & 0xFF) << 16) + ((Static315.aByteArray21[1] & 0xFF) << 8));
				@Pc(93) int local93 = ((Static315.aByteArray21[3] & 0xFF) << 16) - (-((Static315.aByteArray21[4] & 0xFF) << 8) - (Static315.aByteArray21[5] & 0xFF));
				if (local70 < 0 || this.anInt2050 < local70) {
					return null;
				} else if (local93 > 0 && (long) local93 <= this.aClass151_2.method3654() / 520L) {
					@Pc(136) byte[] local136 = new byte[local70];
					@Pc(138) int local138 = 0;
					@Pc(151) int local151 = 0;
					while (local138 < local70) {
						if (local93 == 0) {
							return null;
						}
						this.aClass151_2.method3649((long) (local93 * 520));
						@Pc(174) int local174 = local70 - local138;
						if (local174 > 512) {
							local174 = 512;
						}
						this.aClass151_2.method3647(Static315.aByteArray21, local174 + 8, 0);
						@Pc(205) int local205 = ((Static315.aByteArray21[0] & 0xFF) << 8) + (Static315.aByteArray21[1] & 0xFF);
						@Pc(220) int local220 = ((Static315.aByteArray21[2] & 0xFF) << 8) + (Static315.aByteArray21[3] & 0xFF);
						@Pc(242) int local242 = ((Static315.aByteArray21[5] & 0xFF) << 8) + ((Static315.aByteArray21[4] & 0xFF) << 16) + (Static315.aByteArray21[6] & 0xFF);
						@Pc(248) int local248 = Static315.aByteArray21[7] & 0xFF;
						if (arg0 == local205 && local220 == local151 && local248 == this.anInt2043) {
							if (local242 >= 0 && (long) local242 <= this.aClass151_2.method3654() / 520L) {
								local151++;
								for (@Pc(301) int local301 = 0; local301 < local174; local301++) {
									local136[local138++] = Static315.aByteArray21[local301 + 8];
								}
								local93 = local242;
								continue;
							}
							return null;
						}
						return null;
					}
					return local136;
				} else {
					return null;
				}
			} catch (@Pc(328) IOException local328) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!cr", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt2043;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(III[B)Z")
	public boolean method1859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(6) Class151 local6 = this.aClass151_2;
		synchronized (this.aClass151_2) {
			if (arg0 < 0 || this.anInt2050 < arg0) {
				throw new IllegalArgumentException();
			}
			@Pc(39) boolean local39 = this.method1861(true, arg1, arg0, arg2);
			if (!local39) {
				local39 = this.method1861(false, arg1, arg0, arg2);
			}
			return local39;
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ZII[BB)Z")
	private boolean method1861(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		@Pc(8) Class151 local8 = this.aClass151_2;
		synchronized (this.aClass151_2) {
			try {
				@Pc(22) int local22;
				if (arg0) {
					if (this.aClass151_1.method3654() < (long) (arg1 * 6 + 6)) {
						return false;
					}
					this.aClass151_1.method3649((long) (arg1 * 6));
					this.aClass151_1.method3647(Static315.aByteArray21, 6, 0);
					local22 = ((Static315.aByteArray21[3] & 0xFF) << 16) + ((Static315.aByteArray21[4] & 0xFF) << 8) + (Static315.aByteArray21[5] & 0xFF);
					if (local22 <= 0 || this.aClass151_2.method3654() / 520L < (long) local22) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass151_2.method3654() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static315.aByteArray21[3] = (byte) (local22 >> 16);
				Static315.aByteArray21[5] = (byte) local22;
				Static315.aByteArray21[1] = (byte) (arg2 >> 8);
				Static315.aByteArray21[2] = (byte) arg2;
				Static315.aByteArray21[4] = (byte) (local22 >> 8);
				Static315.aByteArray21[0] = (byte) (arg2 >> 16);
				this.aClass151_1.method3649((long) (arg1 * 6));
				this.aClass151_1.method3650(0, Static315.aByteArray21, 6);
				@Pc(162) int local162 = 0;
				@Pc(169) int local169 = 0;
				while (local162 < arg2) {
					@Pc(173) int local173 = 0;
					@Pc(208) int local208;
					if (arg0) {
						this.aClass151_2.method3649((long) (local22 * 520));
						try {
							this.aClass151_2.method3647(Static315.aByteArray21, 8, 0);
						} catch (@Pc(192) EOFException local192) {
							return true;
						}
						local208 = (Static315.aByteArray21[1] & 0xFF) + ((Static315.aByteArray21[0] & 0xFF) << 8);
						local173 = ((Static315.aByteArray21[5] & 0xFF) << 8) + ((Static315.aByteArray21[4] & 0xFF) << 16) + (Static315.aByteArray21[6] & 0xFF);
						@Pc(244) int local244 = ((Static315.aByteArray21[2] & 0xFF) << 8) + (Static315.aByteArray21[3] & 0xFF);
						@Pc(250) int local250 = Static315.aByteArray21[7] & 0xFF;
						if (local208 != arg1 || local244 != local169 || local250 != this.anInt2043) {
							return false;
						}
						if (local173 < 0 || this.aClass151_2.method3654() / 520L < (long) local173) {
							return false;
						}
					}
					if (local173 == 0) {
						local173 = (int) ((this.aClass151_2.method3654() + 519L) / 520L);
						arg0 = false;
						if (local173 == 0) {
							local173++;
						}
						if (local173 == local22) {
							local173++;
						}
					}
					Static315.aByteArray21[0] = (byte) (arg1 >> 8);
					Static315.aByteArray21[3] = (byte) local169;
					Static315.aByteArray21[1] = (byte) arg1;
					Static315.aByteArray21[2] = (byte) (local169 >> 8);
					if (arg2 - local162 <= 512) {
						local173 = 0;
					}
					Static315.aByteArray21[4] = (byte) (local173 >> 16);
					Static315.aByteArray21[5] = (byte) (local173 >> 8);
					Static315.aByteArray21[7] = (byte) this.anInt2043;
					Static315.aByteArray21[6] = (byte) local173;
					this.aClass151_2.method3649((long) (local22 * 520));
					this.aClass151_2.method3650(0, Static315.aByteArray21, 8);
					local208 = arg2 - local162;
					if (local208 > 512) {
						local208 = 512;
					}
					this.aClass151_2.method3650(local162, arg3, local208);
					local162 += local208;
					local22 = local173;
					local169++;
				}
				return true;
			} catch (@Pc(427) IOException local427) {
				return false;
			}
		}
	}
}
