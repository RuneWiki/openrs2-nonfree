import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class41 {

	@OriginalMember(owner = "client!nd", name = "k", descriptor = "Lclient!pb;")
	private Class46 aClass46_3 = null;

	@OriginalMember(owner = "client!nd", name = "n", descriptor = "Lclient!pb;")
	private Class46 aClass46_4 = null;

	@OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
	private int anInt1975 = 65000;

	@OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
	private final int anInt1969;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(ILclient!pb;Lclient!pb;I)V")
	public Class41(@OriginalArg(0) int arg0, @OriginalArg(1) Class46 arg1, @OriginalArg(2) Class46 arg2, @OriginalArg(3) int arg3) {
		this.anInt1975 = arg3;
		this.aClass46_4 = arg1;
		this.aClass46_3 = arg2;
		this.anInt1969 = arg0;
	}

	@OriginalMember(owner = "client!nd", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt1969;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)[B")
	public byte[] method1257(@OriginalArg(1) int arg0) {
		@Pc(11) Class46 local11 = this.aClass46_4;
		synchronized (this.aClass46_4) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass46_3.method1317()) {
					return null;
				}
				this.aClass46_3.method1321((long) (arg0 * 6));
				this.aClass46_3.method1324(Static47.aByteArray9, 6, 0);
				@Pc(72) int local72 = (Static47.aByteArray9[2] & 0xFF) + ((Static47.aByteArray9[1] & 0xFF) << 8) + ((Static47.aByteArray9[0] & 0xFF) << 16);
				@Pc(95) int local95 = (Static47.aByteArray9[5] & 0xFF) + (((Static47.aByteArray9[3] & 0xFF) << 16) + ((Static47.aByteArray9[4] & 0xFF) << 8));
				if (local72 < 0 || this.anInt1975 < local72) {
					return null;
				} else if (local95 > 0 && this.aClass46_4.method1317() / 520L >= (long) local95) {
					@Pc(139) byte[] local139 = new byte[local72];
					@Pc(141) int local141 = 0;
					@Pc(143) int local143 = 0;
					label55: while (local72 > local141) {
						if (local95 == 0) {
							return null;
						}
						this.aClass46_4.method1321((long) (local95 * 520));
						@Pc(168) int local168 = local72 - local141;
						if (local168 > 512) {
							local168 = 512;
						}
						this.aClass46_4.method1324(Static47.aByteArray9, local168 + 8, 0);
						@Pc(198) int local198 = (Static47.aByteArray9[1] & 0xFF) + ((Static47.aByteArray9[0] & 0xFF) << 8);
						@Pc(213) int local213 = ((Static47.aByteArray9[2] & 0xFF) << 8) + (Static47.aByteArray9[3] & 0xFF);
						@Pc(235) int local235 = ((Static47.aByteArray9[5] & 0xFF) << 8) + ((Static47.aByteArray9[4] & 0xFF) << 16) + (Static47.aByteArray9[6] & 0xFF);
						@Pc(241) int local241 = Static47.aByteArray9[7] & 0xFF;
						if (arg0 == local198 && local213 == local143 && local241 == this.anInt1969) {
							if (local235 >= 0 && this.aClass46_4.method1317() / 520L >= (long) local235) {
								local95 = local235;
								local143++;
								@Pc(291) int local291 = 0;
								while (true) {
									if (local168 <= local291) {
										continue label55;
									}
									local139[local141++] = Static47.aByteArray9[local291 + 8];
									local291++;
								}
							}
							return null;
						}
						return null;
					}
					return local139;
				} else {
					return null;
				}
			} catch (@Pc(319) IOException local319) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(II[BB)Z")
	public boolean method1260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(6) Class46 local6 = this.aClass46_4;
		synchronized (this.aClass46_4) {
			if (arg1 < 0 || arg1 > this.anInt1975) {
				throw new IllegalArgumentException();
			}
			@Pc(33) boolean local33 = this.method1263(arg2, arg0, true, arg1);
			if (!local33) {
				local33 = this.method1263(arg2, arg0, false, arg1);
			}
			return local33;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "([BBIZI)Z")
	private boolean method1263(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class46 local8 = this.aClass46_4;
		synchronized (this.aClass46_4) {
			try {
				@Pc(22) int local22;
				if (arg2) {
					if ((long) (arg1 * 6 + 6) > this.aClass46_3.method1317()) {
						return false;
					}
					this.aClass46_3.method1321((long) (arg1 * 6));
					this.aClass46_3.method1324(Static47.aByteArray9, 6, 0);
					local22 = ((Static47.aByteArray9[3] & 0xFF) << 16) + ((Static47.aByteArray9[4] & 0xFF) << 8) + (Static47.aByteArray9[5] & 0xFF);
					if (local22 <= 0 || (long) local22 > this.aClass46_4.method1317() / 520L) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass46_4.method1317() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static47.aByteArray9[0] = (byte) (arg3 >> 16);
				Static47.aByteArray9[1] = (byte) (arg3 >> 8);
				Static47.aByteArray9[2] = (byte) arg3;
				@Pc(127) int local127 = 0;
				Static47.aByteArray9[3] = (byte) (local22 >> 16);
				@Pc(142) int local142 = 0;
				Static47.aByteArray9[4] = (byte) (local22 >> 8);
				Static47.aByteArray9[5] = (byte) local22;
				this.aClass46_3.method1321((long) (arg1 * 6));
				this.aClass46_3.method1325(0, 6, Static47.aByteArray9);
				while (arg3 > local127) {
					@Pc(173) int local173 = 0;
					@Pc(231) int local231;
					if (arg2) {
						this.aClass46_4.method1321((long) (local22 * 520));
						try {
							this.aClass46_4.method1324(Static47.aByteArray9, 8, 0);
						} catch (@Pc(192) EOFException local192) {
							return true;
						}
						local173 = (Static47.aByteArray9[6] & 0xFF) + ((Static47.aByteArray9[5] & 0xFF) << 8) + ((Static47.aByteArray9[4] & 0xFF) << 16);
						local231 = ((Static47.aByteArray9[0] & 0xFF) << 8) + (Static47.aByteArray9[1] & 0xFF);
						@Pc(246) int local246 = ((Static47.aByteArray9[2] & 0xFF) << 8) + (Static47.aByteArray9[3] & 0xFF);
						@Pc(252) int local252 = Static47.aByteArray9[7] & 0xFF;
						if (arg1 != local231 || local246 != local142 || local252 != this.anInt1969) {
							return false;
						}
						if (local173 < 0 || this.aClass46_4.method1317() / 520L < (long) local173) {
							return false;
						}
					}
					if (local173 == 0) {
						arg2 = false;
						local173 = (int) ((this.aClass46_4.method1317() + 519L) / 520L);
						if (local173 == 0) {
							local173++;
						}
						if (local22 == local173) {
							local173++;
						}
					}
					Static47.aByteArray9[0] = (byte) (arg1 >> 8);
					if (arg3 - local127 <= 512) {
						local173 = 0;
					}
					local231 = arg3 - local127;
					Static47.aByteArray9[1] = (byte) arg1;
					if (local231 > 512) {
						local231 = 512;
					}
					Static47.aByteArray9[2] = (byte) (local142 >> 8);
					Static47.aByteArray9[3] = (byte) local142;
					local142++;
					Static47.aByteArray9[4] = (byte) (local173 >> 16);
					Static47.aByteArray9[5] = (byte) (local173 >> 8);
					Static47.aByteArray9[6] = (byte) local173;
					Static47.aByteArray9[7] = (byte) this.anInt1969;
					this.aClass46_4.method1321((long) (local22 * 520));
					this.aClass46_4.method1325(0, 8, Static47.aByteArray9);
					local22 = local173;
					this.aClass46_4.method1325(local127, local231, arg0);
					local127 += local231;
				}
				return true;
			} catch (@Pc(421) IOException local421) {
				return false;
			}
		}
	}
}
