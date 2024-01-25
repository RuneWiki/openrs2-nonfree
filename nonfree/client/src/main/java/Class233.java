import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nw")
public final class Class233 {

	@OriginalMember(owner = "client!nw", name = "c", descriptor = "Lclient!l;")
	private Class184 aClass184_5 = null;

	@OriginalMember(owner = "client!nw", name = "h", descriptor = "Lclient!l;")
	private Class184 aClass184_6 = null;

	@OriginalMember(owner = "client!nw", name = "i", descriptor = "I")
	private int anInt7438 = 65000;

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "I")
	private final int anInt7433;

	@OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(ILclient!l;Lclient!l;I)V")
	public Class233(@OriginalArg(0) int arg0, @OriginalArg(1) Class184 arg1, @OriginalArg(2) Class184 arg2, @OriginalArg(3) int arg3) {
		this.anInt7433 = arg0;
		this.aClass184_5 = arg1;
		this.aClass184_6 = arg2;
		this.anInt7438 = arg3;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(II[BI)Z")
	public boolean method6304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(11) Class184 local11 = this.aClass184_5;
		synchronized (this.aClass184_5) {
			if (arg0 < 0 || this.anInt7438 < arg0) {
				throw new IllegalArgumentException();
			}
			@Pc(38) boolean local38 = this.method6306(arg2, arg1, arg0, true);
			if (!local38) {
				local38 = this.method6306(arg2, arg1, arg0, false);
			}
			return local38;
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(BI)[B")
	public byte[] method6305(@OriginalArg(1) int arg0) {
		@Pc(8) Class184 local8 = this.aClass184_5;
		synchronized (this.aClass184_5) {
			try {
				if (this.aClass184_6.method5458() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass184_6.method5460((long) (arg0 * 6));
				this.aClass184_6.method5459(0, Static527.aByteArray134, 6);
				@Pc(71) int local71 = (Static527.aByteArray134[2] & 0xFF) + ((Static527.aByteArray134[1] & 0xFF) << 8) + ((Static527.aByteArray134[0] & 0xFF) << 16);
				@Pc(94) int local94 = (Static527.aByteArray134[5] & 0xFF) + ((Static527.aByteArray134[3] & 0xFF) << 16) + ((Static527.aByteArray134[4] & 0xFF) << 8);
				if (local71 < 0 || local71 > this.anInt7438) {
					return null;
				} else if (local94 > 0 && (long) local94 <= this.aClass184_5.method5458() / 520L) {
					@Pc(134) byte[] local134 = new byte[local71];
					@Pc(136) int local136 = 0;
					@Pc(147) int local147 = 0;
					label55: while (local136 < local71) {
						if (local94 == 0) {
							return null;
						}
						this.aClass184_5.method5460((long) (local94 * 520));
						@Pc(173) int local173 = local71 - local136;
						if (local173 > 512) {
							local173 = 512;
						}
						this.aClass184_5.method5459(0, Static527.aByteArray134, local173 + 8);
						@Pc(203) int local203 = ((Static527.aByteArray134[0] & 0xFF) << 8) + (Static527.aByteArray134[1] & 0xFF);
						@Pc(217) int local217 = ((Static527.aByteArray134[2] & 0xFF) << 8) + (Static527.aByteArray134[3] & 0xFF);
						@Pc(239) int local239 = ((Static527.aByteArray134[5] & 0xFF) << 8) + ((Static527.aByteArray134[4] & 0xFF) << 16) + (Static527.aByteArray134[6] & 0xFF);
						@Pc(245) int local245 = Static527.aByteArray134[7] & 0xFF;
						if (arg0 == local203 && local147 == local217 && this.anInt7433 == local245) {
							if (local239 >= 0 && (long) local239 <= this.aClass184_5.method5458() / 520L) {
								local94 = local239;
								local147++;
								@Pc(294) int local294 = 0;
								while (true) {
									if (local294 >= local173) {
										continue label55;
									}
									local134[local136++] = Static527.aByteArray134[local294 + 8];
									local294++;
								}
							}
							return null;
						}
						return null;
					}
					return local134;
				} else {
					return null;
				}
			} catch (@Pc(323) IOException local323) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "([BIIIZ)Z")
	private boolean method6306(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) Class184 local8 = this.aClass184_5;
		synchronized (this.aClass184_5) {
			try {
				@Pc(69) int local69;
				if (arg3) {
					if (this.aClass184_6.method5458() < (long) (arg1 * 6 + 6)) {
						return false;
					}
					this.aClass184_6.method5460((long) (arg1 * 6));
					this.aClass184_6.method5459(0, Static527.aByteArray134, 6);
					local69 = (Static527.aByteArray134[5] & 0xFF) + ((Static527.aByteArray134[3] & 0xFF) << 16) + ((Static527.aByteArray134[4] & 0xFF) << 8);
					if (local69 <= 0 || (long) local69 > this.aClass184_5.method5458() / 520L) {
						return false;
					}
				} else {
					local69 = (int) ((this.aClass184_5.method5458() + 519L) / 520L);
					if (local69 == 0) {
						local69 = 1;
					}
				}
				Static527.aByteArray134[0] = (byte) (arg2 >> 16);
				Static527.aByteArray134[4] = (byte) (local69 >> 8);
				Static527.aByteArray134[2] = (byte) arg2;
				Static527.aByteArray134[1] = (byte) (arg2 >> 8);
				Static527.aByteArray134[3] = (byte) (local69 >> 16);
				Static527.aByteArray134[5] = (byte) local69;
				this.aClass184_6.method5460((long) (arg1 * 6));
				this.aClass184_6.method5454(0, 6, Static527.aByteArray134);
				@Pc(168) int local168 = 0;
				@Pc(176) int local176 = 0;
				while (local168 < arg2) {
					@Pc(180) int local180 = 0;
					@Pc(215) int local215;
					if (arg3) {
						this.aClass184_5.method5460((long) (local69 * 520));
						try {
							this.aClass184_5.method5459(0, Static527.aByteArray134, 8);
						} catch (@Pc(199) EOFException local199) {
							return true;
						}
						local215 = (Static527.aByteArray134[1] & 0xFF) + ((Static527.aByteArray134[0] & 0xFF) << 8);
						local180 = ((Static527.aByteArray134[5] & 0xFF) << 8) + (((Static527.aByteArray134[4] & 0xFF) << 16) + (Static527.aByteArray134[6] & 0xFF));
						@Pc(252) int local252 = ((Static527.aByteArray134[2] & 0xFF) << 8) + (Static527.aByteArray134[3] & 0xFF);
						@Pc(258) int local258 = Static527.aByteArray134[7] & 0xFF;
						if (arg1 != local215 || local252 != local176 || local258 != this.anInt7433) {
							return false;
						}
						if (local180 < 0 || (long) local180 > this.aClass184_5.method5458() / 520L) {
							return false;
						}
					}
					if (local180 == 0) {
						arg3 = false;
						local180 = (int) ((this.aClass184_5.method5458() + 519L) / 520L);
						if (local180 == 0) {
							local180++;
						}
						if (local180 == local69) {
							local180++;
						}
					}
					if (arg2 - local168 <= 512) {
						local180 = 0;
					}
					Static527.aByteArray134[3] = (byte) local176;
					Static527.aByteArray134[2] = (byte) (local176 >> 8);
					Static527.aByteArray134[0] = (byte) (arg1 >> 8);
					Static527.aByteArray134[1] = (byte) arg1;
					Static527.aByteArray134[5] = (byte) (local180 >> 8);
					Static527.aByteArray134[6] = (byte) local180;
					Static527.aByteArray134[7] = (byte) this.anInt7433;
					Static527.aByteArray134[4] = (byte) (local180 >> 16);
					this.aClass184_5.method5460((long) (local69 * 520));
					this.aClass184_5.method5454(0, 8, Static527.aByteArray134);
					local215 = arg2 - local168;
					if (local215 > 512) {
						local215 = 512;
					}
					this.aClass184_5.method5454(local168, local215, arg0);
					local176++;
					local168 += local215;
					local69 = local180;
				}
				return true;
			} catch (@Pc(437) IOException local437) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!nw", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt7433;
	}
}
