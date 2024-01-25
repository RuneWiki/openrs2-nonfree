import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class93 {

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "Lclient!et;")
	private Class70 aClass70_2 = null;

	@OriginalMember(owner = "client!hc", name = "l", descriptor = "Lclient!et;")
	private Class70 aClass70_3 = null;

	@OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
	private int anInt2779 = 65000;

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
	private final int anInt2777;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(ILclient!et;Lclient!et;I)V")
	public Class93(@OriginalArg(0) int arg0, @OriginalArg(1) Class70 arg1, @OriginalArg(2) Class70 arg2, @OriginalArg(3) int arg3) {
		this.aClass70_3 = arg2;
		this.anInt2779 = arg3;
		this.aClass70_2 = arg1;
		this.anInt2777 = arg0;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BI)[B")
	public byte[] method2226(@OriginalArg(1) int arg0) {
		@Pc(8) Class70 local8 = this.aClass70_2;
		synchronized (this.aClass70_2) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass70_3.method1549()) {
					return null;
				}
				this.aClass70_3.method1552((long) (arg0 * 6));
				this.aClass70_3.method1554(0, Static266.aByteArray75, 6);
				@Pc(76) int local76 = (Static266.aByteArray75[2] & 0xFF) + ((Static266.aByteArray75[0] & 0xFF) << 16) + ((Static266.aByteArray75[1] & 0xFF) << 8);
				@Pc(99) int local99 = ((Static266.aByteArray75[4] & 0xFF) << 8) + ((Static266.aByteArray75[3] << 16 & 0xFF0000) + (Static266.aByteArray75[5] & 0xFF));
				if (local76 < 0 || local76 > this.anInt2779) {
					return null;
				} else if (local99 > 0 && (long) local99 <= this.aClass70_2.method1549() / 520L) {
					@Pc(139) byte[] local139 = new byte[local76];
					@Pc(141) int local141 = 0;
					@Pc(143) int local143 = 0;
					label55: while (local141 < local76) {
						if (local99 == 0) {
							return null;
						}
						this.aClass70_2.method1552((long) (local99 * 520));
						@Pc(166) int local166 = local76 - local141;
						if (local166 > 512) {
							local166 = 512;
						}
						this.aClass70_2.method1554(0, Static266.aByteArray75, local166 + 8);
						@Pc(195) int local195 = ((Static266.aByteArray75[0] & 0xFF) << 8) + (Static266.aByteArray75[1] & 0xFF);
						@Pc(209) int local209 = (Static266.aByteArray75[3] & 0xFF) + ((Static266.aByteArray75[2] & 0xFF) << 8);
						@Pc(231) int local231 = ((Static266.aByteArray75[5] & 0xFF) << 8) + ((Static266.aByteArray75[4] & 0xFF) << 16) + (Static266.aByteArray75[6] & 0xFF);
						@Pc(237) int local237 = Static266.aByteArray75[7] & 0xFF;
						if (arg0 == local195 && local209 == local143 && this.anInt2777 == local237) {
							if (local231 >= 0 && (long) local231 <= this.aClass70_2.method1549() / 520L) {
								local143++;
								local99 = local231;
								@Pc(291) int local291 = 0;
								while (true) {
									if (local291 >= local166) {
										continue label55;
									}
									local139[local141++] = Static266.aByteArray75[local291 + 8];
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
			} catch (@Pc(324) IOException local324) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt2777;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I[BII)Z")
	public boolean method2228(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class70 local11 = this.aClass70_2;
		synchronized (this.aClass70_2) {
			if (arg2 < 0 || this.anInt2779 < arg2) {
				throw new IllegalArgumentException();
			}
			@Pc(35) boolean local35 = this.method2230(arg1, arg0, arg2, true);
			if (!local35) {
				local35 = this.method2230(arg1, arg0, arg2, false);
			}
			return local35;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I[BIZZ)Z")
	private boolean method2230(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class70 local8 = this.aClass70_2;
		synchronized (this.aClass70_2) {
			try {
				@Pc(22) int local22;
				if (arg3) {
					if ((long) (arg0 * 6 + 6) > this.aClass70_3.method1549()) {
						return false;
					}
					this.aClass70_3.method1552((long) (arg0 * 6));
					this.aClass70_3.method1554(0, Static266.aByteArray75, 6);
					local22 = (Static266.aByteArray75[5] & 0xFF) + ((Static266.aByteArray75[3] & 0xFF) << 16) + ((Static266.aByteArray75[4] & 0xFF) << 8);
					if (local22 <= 0 || this.aClass70_2.method1549() / 520L < (long) local22) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass70_2.method1549() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static266.aByteArray75[4] = (byte) (local22 >> 8);
				Static266.aByteArray75[1] = (byte) (arg2 >> 8);
				Static266.aByteArray75[2] = (byte) arg2;
				Static266.aByteArray75[3] = (byte) (local22 >> 16);
				Static266.aByteArray75[5] = (byte) local22;
				Static266.aByteArray75[0] = (byte) (arg2 >> 16);
				this.aClass70_3.method1552((long) (arg0 * 6));
				this.aClass70_3.method1553(Static266.aByteArray75, 0, 6);
				@Pc(160) int local160 = 0;
				@Pc(162) int local162 = 0;
				while (local160 < arg2) {
					@Pc(166) int local166 = 0;
					@Pc(201) int local201;
					if (arg3) {
						this.aClass70_2.method1552((long) (local22 * 520));
						try {
							this.aClass70_2.method1554(0, Static266.aByteArray75, 8);
						} catch (@Pc(185) EOFException local185) {
							return true;
						}
						local201 = (Static266.aByteArray75[1] & 0xFF) + ((Static266.aByteArray75[0] & 0xFF) << 8);
						local166 = ((Static266.aByteArray75[5] & 0xFF) << 8) + ((Static266.aByteArray75[4] & 0xFF) << 16) + (Static266.aByteArray75[6] & 0xFF);
						@Pc(237) int local237 = ((Static266.aByteArray75[2] & 0xFF) << 8) + (Static266.aByteArray75[3] & 0xFF);
						@Pc(243) int local243 = Static266.aByteArray75[7] & 0xFF;
						if (local201 != arg0 || local237 != local162 || local243 != this.anInt2777) {
							return false;
						}
						if (local166 < 0 || (long) local166 > this.aClass70_2.method1549() / 520L) {
							return false;
						}
					}
					if (local166 == 0) {
						local166 = (int) ((this.aClass70_2.method1549() + 519L) / 520L);
						arg3 = false;
						if (local166 == 0) {
							local166++;
						}
						if (local166 == local22) {
							local166++;
						}
					}
					Static266.aByteArray75[1] = (byte) arg0;
					Static266.aByteArray75[3] = (byte) local162;
					Static266.aByteArray75[2] = (byte) (local162 >> 8);
					Static266.aByteArray75[0] = (byte) (arg0 >> 8);
					if (arg2 - local160 <= 512) {
						local166 = 0;
					}
					Static266.aByteArray75[4] = (byte) (local166 >> 16);
					Static266.aByteArray75[7] = (byte) this.anInt2777;
					Static266.aByteArray75[5] = (byte) (local166 >> 8);
					Static266.aByteArray75[6] = (byte) local166;
					this.aClass70_2.method1552((long) (local22 * 520));
					this.aClass70_2.method1553(Static266.aByteArray75, 0, 8);
					local201 = arg2 - local160;
					if (local201 > 512) {
						local201 = 512;
					}
					this.aClass70_2.method1553(arg1, local160, local201);
					local22 = local166;
					local162++;
					local160 += local201;
				}
				return true;
			} catch (@Pc(425) IOException local425) {
				return false;
			}
		}
	}
}
