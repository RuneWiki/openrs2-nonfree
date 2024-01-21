import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class61 {

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "Lclient!oe;")
	private Class56 aClass56_1 = null;

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
	private int anInt2199 = 65000;

	@OriginalMember(owner = "client!pe", name = "x", descriptor = "Lclient!oe;")
	private Class56 aClass56_2 = null;

	@OriginalMember(owner = "client!pe", name = "s", descriptor = "I")
	private final int anInt2204;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(ILclient!oe;Lclient!oe;I)V")
	public Class61(@OriginalArg(0) int arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(2) Class56 arg2, @OriginalArg(3) int arg3) {
		this.aClass56_1 = arg2;
		this.anInt2199 = arg3;
		this.aClass56_2 = arg1;
		this.anInt2204 = arg0;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(II[BI)Z")
	public boolean method1566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(6) Class56 local6 = this.aClass56_2;
		synchronized (this.aClass56_2) {
			if (arg0 < 0 || arg0 > this.anInt2199) {
				throw new IllegalArgumentException();
			}
			@Pc(29) boolean local29 = this.method1569(arg1, arg2, arg0, true);
			if (!local29) {
				local29 = this.method1569(arg1, arg2, arg0, false);
			}
			return local29;
		}
	}

	@OriginalMember(owner = "client!pe", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt2204;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB[BIZ)Z")
	private boolean method1569(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) Class56 local8 = this.aClass56_2;
		synchronized (this.aClass56_2) {
			try {
				@Pc(27) int local27;
				if (arg3) {
					if ((long) (arg0 * 6 + 6) > this.aClass56_1.method1466()) {
						return false;
					}
					this.aClass56_1.method1469((long) (arg0 * 6));
					this.aClass56_1.method1465(0, 6, Static72.aByteArray53);
					local27 = (Static72.aByteArray53[5] & 0xFF) + ((Static72.aByteArray53[3] & 0xFF) << 16) + ((Static72.aByteArray53[4] & 0xFF) << 8);
					if (local27 <= 0 || (long) local27 > this.aClass56_2.method1466() / 520L) {
						return false;
					}
				} else {
					local27 = (int) ((this.aClass56_2.method1466() + 519L) / 520L);
					if (local27 == 0) {
						local27 = 1;
					}
				}
				Static72.aByteArray53[2] = (byte) arg2;
				Static72.aByteArray53[1] = (byte) (arg2 >> 8);
				Static72.aByteArray53[5] = (byte) local27;
				Static72.aByteArray53[3] = (byte) (local27 >> 16);
				Static72.aByteArray53[0] = (byte) (arg2 >> 16);
				Static72.aByteArray53[4] = (byte) (local27 >> 8);
				@Pc(152) int local152 = 0;
				@Pc(154) int local154 = 0;
				this.aClass56_1.method1469((long) (arg0 * 6));
				this.aClass56_1.method1471(6, Static72.aByteArray53, 0);
				while (local154 < arg2) {
					@Pc(173) int local173 = 0;
					@Pc(232) int local232;
					if (arg3) {
						this.aClass56_2.method1469((long) (local27 * 520));
						try {
							this.aClass56_2.method1465(0, 8, Static72.aByteArray53);
						} catch (@Pc(192) EOFException local192) {
							return true;
						}
						local173 = ((Static72.aByteArray53[4] & 0xFF) << 16) - (-((Static72.aByteArray53[5] & 0xFF) << 8) - (Static72.aByteArray53[6] & 0xFF));
						local232 = (Static72.aByteArray53[1] & 0xFF) + ((Static72.aByteArray53[0] & 0xFF) << 8);
						@Pc(246) int local246 = (Static72.aByteArray53[3] & 0xFF) + ((Static72.aByteArray53[2] & 0xFF) << 8);
						@Pc(252) int local252 = Static72.aByteArray53[7] & 0xFF;
						if (local232 != arg0 || local152 != local246 || this.anInt2204 != local252) {
							return false;
						}
						if (local173 < 0 || (long) local173 > this.aClass56_2.method1466() / 520L) {
							return false;
						}
					}
					if (local173 == 0) {
						local173 = (int) ((this.aClass56_2.method1466() + 519L) / 520L);
						if (local173 == 0) {
							local173++;
						}
						arg3 = false;
						if (local27 == local173) {
							local173++;
						}
					}
					if (arg2 - local154 <= 512) {
						local173 = 0;
					}
					Static72.aByteArray53[2] = (byte) (local152 >> 8);
					Static72.aByteArray53[0] = (byte) (arg0 >> 8);
					Static72.aByteArray53[5] = (byte) (local173 >> 8);
					local232 = arg2 - local154;
					if (local232 > 512) {
						local232 = 512;
					}
					Static72.aByteArray53[7] = (byte) this.anInt2204;
					Static72.aByteArray53[4] = (byte) (local173 >> 16);
					Static72.aByteArray53[3] = (byte) local152;
					Static72.aByteArray53[1] = (byte) arg0;
					local152++;
					Static72.aByteArray53[6] = (byte) local173;
					this.aClass56_2.method1469((long) (local27 * 520));
					local27 = local173;
					this.aClass56_2.method1471(8, Static72.aByteArray53, 0);
					this.aClass56_2.method1471(local232, arg1, local154);
					local154 += local232;
				}
				return true;
			} catch (@Pc(424) IOException local424) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)[B")
	public byte[] method1572(@OriginalArg(1) int arg0) {
		@Pc(8) Class56 local8 = this.aClass56_2;
		synchronized (this.aClass56_2) {
			try {
				if (this.aClass56_1.method1466() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass56_1.method1469((long) (arg0 * 6));
				this.aClass56_1.method1465(0, 6, Static72.aByteArray53);
				@Pc(66) int local66 = ((Static72.aByteArray53[1] & 0xFF) << 8) + ((Static72.aByteArray53[0] << 16 & 0xFF0000) + (Static72.aByteArray53[2] & 0xFF));
				@Pc(88) int local88 = ((Static72.aByteArray53[3] & 0xFF) << 16) + ((Static72.aByteArray53[4] & 0xFF) << 8) + (Static72.aByteArray53[5] & 0xFF);
				if (local66 < 0 || local66 > this.anInt2199) {
					return null;
				} else if (local88 > 0 && (long) local88 <= this.aClass56_2.method1466() / 520L) {
					@Pc(132) byte[] local132 = new byte[local66];
					@Pc(134) int local134 = 0;
					@Pc(136) int local136 = 0;
					while (local66 > local134) {
						if (local88 == 0) {
							return null;
						}
						this.aClass56_2.method1469((long) (local88 * 520));
						@Pc(162) int local162 = local66 - local134;
						if (local162 > 512) {
							local162 = 512;
						}
						this.aClass56_2.method1465(0, local162 + 8, Static72.aByteArray53);
						@Pc(193) int local193 = ((Static72.aByteArray53[2] & 0xFF) << 8) + (Static72.aByteArray53[3] & 0xFF);
						@Pc(215) int local215 = (Static72.aByteArray53[6] & 0xFF) + ((Static72.aByteArray53[4] & 0xFF) << 16) + ((Static72.aByteArray53[5] & 0xFF) << 8);
						@Pc(229) int local229 = ((Static72.aByteArray53[0] & 0xFF) << 8) + (Static72.aByteArray53[1] & 0xFF);
						@Pc(235) int local235 = Static72.aByteArray53[7] & 0xFF;
						if (local229 == arg0 && local193 == local136 && this.anInt2204 == local235) {
							if (local215 >= 0 && (long) local215 <= this.aClass56_2.method1466() / 520L) {
								local88 = local215;
								for (@Pc(280) int local280 = 0; local280 < local162; local280++) {
									local132[local134++] = Static72.aByteArray53[local280 + 8];
								}
								local136++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local132;
				} else {
					return null;
				}
			} catch (@Pc(306) IOException local306) {
				return null;
			}
		}
	}
}
