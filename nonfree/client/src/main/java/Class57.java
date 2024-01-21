import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class57 {

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "Lclient!wb;")
	private Class68 aClass68_4 = null;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "Lclient!wb;")
	private Class68 aClass68_3 = null;

	@OriginalMember(owner = "client!sa", name = "m", descriptor = "I")
	private int anInt2348 = 65000;

	@OriginalMember(owner = "client!sa", name = "p", descriptor = "I")
	private final int anInt2350;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(ILclient!wb;Lclient!wb;I)V")
	public Class57(@OriginalArg(0) int arg0, @OriginalArg(1) Class68 arg1, @OriginalArg(2) Class68 arg2, @OriginalArg(3) int arg3) {
		this.anInt2348 = arg3;
		this.aClass68_4 = arg2;
		this.aClass68_3 = arg1;
		this.anInt2350 = arg0;
	}

	@OriginalMember(owner = "client!sa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt2350;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IB)[B")
	public byte[] method1581(@OriginalArg(0) int arg0) {
		@Pc(16) Class68 local16 = this.aClass68_3;
		synchronized (this.aClass68_3) {
			try {
				if (this.aClass68_4.method1809() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass68_4.method1808((long) (arg0 * 6));
				this.aClass68_4.method1812(0, 6, Static37.aByteArray9);
				@Pc(73) int local73 = ((Static37.aByteArray9[4] & 0xFF) << 8) + ((Static37.aByteArray9[3] & 0xFF) << 16) + (Static37.aByteArray9[5] & 0xFF);
				@Pc(96) int local96 = (Static37.aByteArray9[2] & 0xFF) + (((Static37.aByteArray9[0] & 0xFF) << 16) + ((Static37.aByteArray9[1] & 0xFF) << 8));
				if (local96 < 0 || local96 > this.anInt2348) {
					return null;
				} else if (local73 > 0 && (long) local73 <= this.aClass68_3.method1809() / 520L) {
					@Pc(136) int local136 = 0;
					@Pc(138) int local138 = 0;
					@Pc(141) byte[] local141 = new byte[local96];
					while (local96 > local136) {
						if (local73 == 0) {
							return null;
						}
						this.aClass68_3.method1808((long) (local73 * 520));
						@Pc(167) int local167 = local96 - local136;
						if (local167 > 512) {
							local167 = 512;
						}
						this.aClass68_3.method1812(0, local167 + 8, Static37.aByteArray9);
						@Pc(197) int local197 = ((Static37.aByteArray9[0] & 0xFF) << 8) + (Static37.aByteArray9[1] & 0xFF);
						@Pc(219) int local219 = (Static37.aByteArray9[6] & 0xFF) + ((Static37.aByteArray9[5] & 0xFF) << 8) + ((Static37.aByteArray9[4] & 0xFF) << 16);
						@Pc(234) int local234 = ((Static37.aByteArray9[2] & 0xFF) << 8) + (Static37.aByteArray9[3] & 0xFF);
						@Pc(240) int local240 = Static37.aByteArray9[7] & 0xFF;
						if (local197 == arg0 && local234 == local138 && local240 == this.anInt2350) {
							if (local219 >= 0 && (long) local219 <= this.aClass68_3.method1809() / 520L) {
								local138++;
								for (@Pc(296) int local296 = 0; local296 < local167; local296++) {
									local141[local136++] = Static37.aByteArray9[local296 + 8];
								}
								local73 = local219;
								continue;
							}
							return null;
						}
						return null;
					}
					return local141;
				} else {
					return null;
				}
			} catch (@Pc(331) IOException local331) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "([BIZIB)Z")
	private boolean method1582(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class68 local8 = this.aClass68_3;
		synchronized (this.aClass68_3) {
			try {
				@Pc(76) int local76;
				if (arg2) {
					if (this.aClass68_4.method1809() < (long) (arg3 * 6 + 6)) {
						return false;
					}
					this.aClass68_4.method1808((long) (arg3 * 6));
					this.aClass68_4.method1812(0, 6, Static37.aByteArray9);
					local76 = (Static37.aByteArray9[5] & 0xFF) + (((Static37.aByteArray9[3] & 0xFF) << 16) + ((Static37.aByteArray9[4] & 0xFF) << 8));
					if (local76 <= 0 || (long) local76 > this.aClass68_3.method1809() / 520L) {
						return false;
					}
				} else {
					local76 = (int) ((this.aClass68_3.method1809() + 519L) / 520L);
					if (local76 == 0) {
						local76 = 1;
					}
				}
				Static37.aByteArray9[0] = (byte) (arg1 >> 16);
				Static37.aByteArray9[1] = (byte) (arg1 >> 8);
				Static37.aByteArray9[2] = (byte) arg1;
				@Pc(136) int local136 = 0;
				Static37.aByteArray9[3] = (byte) (local76 >> 16);
				@Pc(145) int local145 = 0;
				Static37.aByteArray9[4] = (byte) (local76 >> 8);
				Static37.aByteArray9[5] = (byte) local76;
				this.aClass68_4.method1808((long) (arg3 * 6));
				this.aClass68_4.method1810(0, 6, Static37.aByteArray9);
				while (local136 < arg1) {
					@Pc(176) int local176 = 0;
					@Pc(234) int local234;
					if (arg2) {
						this.aClass68_3.method1808((long) (local76 * 520));
						try {
							this.aClass68_3.method1812(0, 8, Static37.aByteArray9);
						} catch (@Pc(195) EOFException local195) {
							return true;
						}
						local176 = (Static37.aByteArray9[6] & 0xFF) + (((Static37.aByteArray9[4] & 0xFF) << 16) + ((Static37.aByteArray9[5] & 0xFF) << 8));
						local234 = (Static37.aByteArray9[1] & 0xFF) + ((Static37.aByteArray9[0] & 0xFF) << 8);
						@Pc(240) int local240 = Static37.aByteArray9[7] & 0xFF;
						@Pc(254) int local254 = (Static37.aByteArray9[3] & 0xFF) + ((Static37.aByteArray9[2] & 0xFF) << 8);
						if (arg3 != local234 || local254 != local145 || local240 != this.anInt2350) {
							return false;
						}
						if (local176 < 0 || this.aClass68_3.method1809() / 520L < (long) local176) {
							return false;
						}
					}
					if (local176 == 0) {
						arg2 = false;
						local176 = (int) ((this.aClass68_3.method1809() + 519L) / 520L);
						if (local176 == 0) {
							local176++;
						}
						if (local76 == local176) {
							local176++;
						}
					}
					Static37.aByteArray9[0] = (byte) (arg3 >> 8);
					if (arg1 - local136 <= 512) {
						local176 = 0;
					}
					Static37.aByteArray9[1] = (byte) arg3;
					local234 = arg1 - local136;
					if (local234 > 512) {
						local234 = 512;
					}
					Static37.aByteArray9[2] = (byte) (local145 >> 8);
					Static37.aByteArray9[3] = (byte) local145;
					Static37.aByteArray9[4] = (byte) (local176 >> 16);
					Static37.aByteArray9[5] = (byte) (local176 >> 8);
					local145++;
					Static37.aByteArray9[6] = (byte) local176;
					Static37.aByteArray9[7] = (byte) this.anInt2350;
					this.aClass68_3.method1808((long) (local76 * 520));
					this.aClass68_3.method1810(0, 8, Static37.aByteArray9);
					local76 = local176;
					this.aClass68_3.method1810(local136, local234, arg0);
					local136 += local234;
				}
				return true;
			} catch (@Pc(428) IOException local428) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "([BIII)Z")
	public boolean method1583(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class68 local6 = this.aClass68_3;
		synchronized (this.aClass68_3) {
			if (arg1 < 0 || arg1 > this.anInt2348) {
				throw new IllegalArgumentException();
			}
			@Pc(36) boolean local36 = this.method1582(arg0, arg1, true, arg2);
			if (!local36) {
				local36 = this.method1582(arg0, arg1, false, arg2);
			}
			return local36;
		}
	}
}
