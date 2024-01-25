import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class250 {

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "Lclient!af;")
	private Class6 aClass6_5 = null;

	@OriginalMember(owner = "client!ur", name = "f", descriptor = "I")
	private int anInt6552 = 65000;

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "Lclient!af;")
	private Class6 aClass6_4 = null;

	@OriginalMember(owner = "client!ur", name = "h", descriptor = "I")
	private final int anInt6554;

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(ILclient!af;Lclient!af;I)V")
	public Class250(@OriginalArg(0) int arg0, @OriginalArg(1) Class6 arg1, @OriginalArg(2) Class6 arg2, @OriginalArg(3) int arg3) {
		this.anInt6554 = arg0;
		this.anInt6552 = arg3;
		this.aClass6_5 = arg2;
		this.aClass6_4 = arg1;
	}

	@OriginalMember(owner = "client!ur", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt6554;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "([BIII)Z")
	public boolean method5186(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class6 local6 = this.aClass6_4;
		synchronized (this.aClass6_4) {
			if (arg1 < 0 || this.anInt6552 < arg1) {
				throw new IllegalArgumentException();
			}
			@Pc(35) boolean local35 = this.method5190(arg0, arg1, arg2, true);
			if (!local35) {
				local35 = this.method5190(arg0, arg1, arg2, false);
			}
			return local35;
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(II)[B")
	public byte[] method5188(@OriginalArg(1) int arg0) {
		@Pc(8) Class6 local8 = this.aClass6_4;
		synchronized (this.aClass6_4) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass6_5.method27()) {
					return null;
				}
				this.aClass6_5.method28((long) (arg0 * 6));
				this.aClass6_5.method32(Static275.aByteArray71, 0, 6);
				@Pc(69) int local69 = (Static275.aByteArray71[2] & 0xFF) + ((Static275.aByteArray71[0] & 0xFF) << 16) + ((Static275.aByteArray71[1] & 0xFF) << 8);
				@Pc(91) int local91 = ((Static275.aByteArray71[4] & 0xFF) << 8) + (Static275.aByteArray71[3] << 16 & 0xFF0000) + (Static275.aByteArray71[5] & 0xFF);
				if (local69 < 0 || this.anInt6552 < local69) {
					return null;
				} else if (local91 > 0 && (long) local91 <= this.aClass6_4.method27() / 520L) {
					@Pc(135) byte[] local135 = new byte[local69];
					@Pc(142) int local142 = 0;
					@Pc(144) int local144 = 0;
					while (local142 < local69) {
						if (local91 == 0) {
							return null;
						}
						this.aClass6_4.method28((long) (local91 * 520));
						@Pc(167) int local167 = local69 - local142;
						if (local167 > 512) {
							local167 = 512;
						}
						this.aClass6_4.method32(Static275.aByteArray71, 0, local167 + 8);
						@Pc(198) int local198 = ((Static275.aByteArray71[0] & 0xFF) << 8) + (Static275.aByteArray71[1] & 0xFF);
						@Pc(212) int local212 = (Static275.aByteArray71[3] & 0xFF) + ((Static275.aByteArray71[2] & 0xFF) << 8);
						@Pc(236) int local236 = ((Static275.aByteArray71[4] & 0xFF) << 16) + ((Static275.aByteArray71[5] & 0xFF) << 8) + (Static275.aByteArray71[6] & 0xFF);
						@Pc(242) int local242 = Static275.aByteArray71[7] & 0xFF;
						if (arg0 == local198 && local144 == local212 && local242 == this.anInt6554) {
							if (local236 >= 0 && (long) local236 <= this.aClass6_4.method27() / 520L) {
								for (@Pc(282) int local282 = 0; local282 < local167; local282++) {
									local135[local142++] = Static275.aByteArray71[local282 + 8];
								}
								local144++;
								local91 = local236;
								continue;
							}
							return null;
						}
						return null;
					}
					return local135;
				} else {
					return null;
				}
			} catch (@Pc(314) IOException local314) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(I[BIIZ)Z")
	private boolean method5190(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) Class6 local8 = this.aClass6_4;
		synchronized (this.aClass6_4) {
			try {
				@Pc(71) int local71;
				if (arg3) {
					if (this.aClass6_5.method27() < (long) (arg2 * 6 + 6)) {
						return false;
					}
					this.aClass6_5.method28((long) (arg2 * 6));
					this.aClass6_5.method32(Static275.aByteArray71, 0, 6);
					local71 = ((Static275.aByteArray71[3] & 0xFF) << 16) + ((Static275.aByteArray71[4] & 0xFF) << 8) + (Static275.aByteArray71[5] & 0xFF);
					if (local71 <= 0 || this.aClass6_4.method27() / 520L < (long) local71) {
						return false;
					}
				} else {
					local71 = (int) ((this.aClass6_4.method27() + 519L) / 520L);
					if (local71 == 0) {
						local71 = 1;
					}
				}
				Static275.aByteArray71[1] = (byte) (arg1 >> 8);
				Static275.aByteArray71[0] = (byte) (arg1 >> 16);
				Static275.aByteArray71[4] = (byte) (local71 >> 8);
				Static275.aByteArray71[5] = (byte) local71;
				Static275.aByteArray71[3] = (byte) (local71 >> 16);
				Static275.aByteArray71[2] = (byte) arg1;
				this.aClass6_5.method28((long) (arg2 * 6));
				this.aClass6_5.method29(6, 0, Static275.aByteArray71);
				@Pc(164) int local164 = 0;
				@Pc(166) int local166 = 0;
				while (local164 < arg1) {
					@Pc(175) int local175 = 0;
					@Pc(211) int local211;
					if (arg3) {
						this.aClass6_4.method28((long) (local71 * 520));
						try {
							this.aClass6_4.method32(Static275.aByteArray71, 0, 8);
						} catch (@Pc(194) EOFException local194) {
							return true;
						}
						local211 = ((Static275.aByteArray71[0] & 0xFF) << 8) + (Static275.aByteArray71[1] & 0xFF);
						@Pc(226) int local226 = ((Static275.aByteArray71[2] & 0xFF) << 8) + (Static275.aByteArray71[3] & 0xFF);
						local175 = ((Static275.aByteArray71[5] & 0xFF) << 8) + ((Static275.aByteArray71[4] & 0xFF) << 16) + (Static275.aByteArray71[6] & 0xFF);
						@Pc(254) int local254 = Static275.aByteArray71[7] & 0xFF;
						if (local211 != arg2 || local166 != local226 || this.anInt6554 != local254) {
							return false;
						}
						if (local175 < 0 || (long) local175 > this.aClass6_4.method27() / 520L) {
							return false;
						}
					}
					if (local175 == 0) {
						arg3 = false;
						local175 = (int) ((this.aClass6_4.method27() + 519L) / 520L);
						if (local175 == 0) {
							local175++;
						}
						if (local175 == local71) {
							local175++;
						}
					}
					Static275.aByteArray71[2] = (byte) (local166 >> 8);
					Static275.aByteArray71[1] = (byte) arg2;
					if (arg1 - local164 <= 512) {
						local175 = 0;
					}
					Static275.aByteArray71[0] = (byte) (arg2 >> 8);
					Static275.aByteArray71[3] = (byte) local166;
					Static275.aByteArray71[6] = (byte) local175;
					Static275.aByteArray71[7] = (byte) this.anInt6554;
					Static275.aByteArray71[4] = (byte) (local175 >> 16);
					Static275.aByteArray71[5] = (byte) (local175 >> 8);
					this.aClass6_4.method28((long) (local71 * 520));
					this.aClass6_4.method29(8, 0, Static275.aByteArray71);
					local211 = arg1 - local164;
					if (local211 > 512) {
						local211 = 512;
					}
					this.aClass6_4.method29(local211, local164, arg0);
					local164 += local211;
					local71 = local175;
					local166++;
				}
				return true;
			} catch (@Pc(421) IOException local421) {
				return false;
			}
		}
	}
}
