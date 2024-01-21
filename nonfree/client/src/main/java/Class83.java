import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class83 {

	@OriginalMember(owner = "client!s", name = "a", descriptor = "Lclient!w;")
	private Class96 aClass96_36 = null;

	@OriginalMember(owner = "client!s", name = "i", descriptor = "Lclient!w;")
	private Class96 aClass96_37 = null;

	@OriginalMember(owner = "client!s", name = "q", descriptor = "I")
	private int anInt3465 = 65000;

	@OriginalMember(owner = "client!s", name = "o", descriptor = "I")
	private final int anInt3463;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(ILclient!w;Lclient!w;I)V")
	public Class83(@OriginalArg(0) int arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) Class96 arg2, @OriginalArg(3) int arg3) {
		this.anInt3463 = arg0;
		this.anInt3465 = arg3;
		this.aClass96_37 = arg1;
		this.aClass96_36 = arg2;
	}

	@OriginalMember(owner = "client!s", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt3463;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Z[BIBI)Z")
	private boolean method2605(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class96 local8 = this.aClass96_37;
		synchronized (this.aClass96_37) {
			try {
				@Pc(69) int local69;
				if (arg0) {
					if ((long) (arg3 * 6 + 6) > this.aClass96_36.method3344()) {
						return false;
					}
					this.aClass96_36.method3341((long) (arg3 * 6));
					this.aClass96_36.method3347(6, Static195.aByteArray51, 0);
					local69 = ((Static195.aByteArray51[3] & 0xFF) << 16) - (-((Static195.aByteArray51[4] & 0xFF) << 8) - (Static195.aByteArray51[5] & 0xFF));
					if (local69 <= 0 || (long) local69 > this.aClass96_37.method3344() / 520L) {
						return false;
					}
				} else {
					local69 = (int) ((this.aClass96_37.method3344() + 519L) / 520L);
					if (local69 == 0) {
						local69 = 1;
					}
				}
				Static195.aByteArray51[0] = (byte) (arg2 >> 16);
				Static195.aByteArray51[2] = (byte) arg2;
				Static195.aByteArray51[5] = (byte) local69;
				Static195.aByteArray51[1] = (byte) (arg2 >> 8);
				Static195.aByteArray51[4] = (byte) (local69 >> 8);
				@Pc(152) int local152 = 0;
				Static195.aByteArray51[3] = (byte) (local69 >> 16);
				@Pc(161) int local161 = 0;
				this.aClass96_36.method3341((long) (arg3 * 6));
				this.aClass96_36.method3336(6, 0, Static195.aByteArray51);
				while (local161 < arg2) {
					@Pc(180) int local180 = 0;
					@Pc(258) int local258;
					if (arg0) {
						this.aClass96_37.method3341((long) (local69 * 520));
						try {
							this.aClass96_37.method3347(8, Static195.aByteArray51, 0);
						} catch (@Pc(199) EOFException local199) {
							return true;
						}
						local180 = ((Static195.aByteArray51[4] & 0xFF) << 16) + ((Static195.aByteArray51[5] & 0xFF) << 8) + (Static195.aByteArray51[6] & 0xFF);
						@Pc(238) int local238 = (Static195.aByteArray51[3] & 0xFF) + ((Static195.aByteArray51[2] & 0xFF) << 8);
						@Pc(244) int local244 = Static195.aByteArray51[7] & 0xFF;
						local258 = (Static195.aByteArray51[1] & 0xFF) + ((Static195.aByteArray51[0] & 0xFF) << 8);
						if (local258 != arg3 || local152 != local238 || this.anInt3463 != local244) {
							return false;
						}
						if (local180 < 0 || this.aClass96_37.method3344() / 520L < (long) local180) {
							return false;
						}
					}
					if (local180 == 0) {
						local180 = (int) ((this.aClass96_37.method3344() + 519L) / 520L);
						arg0 = false;
						if (local180 == 0) {
							local180++;
						}
						if (local69 == local180) {
							local180++;
						}
					}
					Static195.aByteArray51[3] = (byte) local152;
					Static195.aByteArray51[2] = (byte) (local152 >> 8);
					Static195.aByteArray51[1] = (byte) arg3;
					local258 = arg2 - local161;
					local152++;
					Static195.aByteArray51[0] = (byte) (arg3 >> 8);
					if (local258 > 512) {
						local258 = 512;
					}
					if (arg2 - local161 <= 512) {
						local180 = 0;
					}
					Static195.aByteArray51[7] = (byte) this.anInt3463;
					Static195.aByteArray51[5] = (byte) (local180 >> 8);
					Static195.aByteArray51[4] = (byte) (local180 >> 16);
					Static195.aByteArray51[6] = (byte) local180;
					this.aClass96_37.method3341((long) (local69 * 520));
					this.aClass96_37.method3336(8, 0, Static195.aByteArray51);
					this.aClass96_37.method3336(local258, local161, arg1);
					local69 = local180;
					local161 += local258;
				}
				return true;
			} catch (@Pc(433) IOException local433) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II)[B")
	public byte[] method2606(@OriginalArg(0) int arg0) {
		@Pc(8) Class96 local8 = this.aClass96_37;
		synchronized (this.aClass96_37) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass96_36.method3344()) {
					return null;
				}
				this.aClass96_36.method3341((long) (arg0 * 6));
				this.aClass96_36.method3347(6, Static195.aByteArray51, 0);
				@Pc(72) int local72 = ((Static195.aByteArray51[1] & 0xFF) << 8) + ((Static195.aByteArray51[0] << 16 & 0xFF0000) + (Static195.aByteArray51[2] & 0xFF));
				@Pc(94) int local94 = ((Static195.aByteArray51[4] & 0xFF) << 8) + ((Static195.aByteArray51[3] & 0xFF) << 16) + (Static195.aByteArray51[5] & 0xFF);
				if (local72 < 0 || local72 > this.anInt3465) {
					return null;
				} else if (local94 > 0 && (long) local94 <= this.aClass96_37.method3344() / 520L) {
					@Pc(134) byte[] local134 = new byte[local72];
					@Pc(136) int local136 = 0;
					@Pc(138) int local138 = 0;
					label55: while (local136 < local72) {
						if (local94 == 0) {
							return null;
						}
						this.aClass96_37.method3341((long) (local94 * 520));
						@Pc(164) int local164 = local72 - local136;
						if (local164 > 512) {
							local164 = 512;
						}
						this.aClass96_37.method3347(local164 + 8, Static195.aByteArray51, 0);
						@Pc(194) int local194 = (Static195.aByteArray51[1] & 0xFF) + ((Static195.aByteArray51[0] & 0xFF) << 8);
						@Pc(209) int local209 = ((Static195.aByteArray51[2] & 0xFF) << 8) + (Static195.aByteArray51[3] & 0xFF);
						@Pc(215) int local215 = Static195.aByteArray51[7] & 0xFF;
						@Pc(237) int local237 = (Static195.aByteArray51[6] & 0xFF) + ((Static195.aByteArray51[4] & 0xFF) << 16) + ((Static195.aByteArray51[5] & 0xFF) << 8);
						if (local194 == arg0 && local138 == local209 && this.anInt3463 == local215) {
							if (local237 >= 0 && this.aClass96_37.method3344() / 520L >= (long) local237) {
								local138++;
								local94 = local237;
								@Pc(289) int local289 = 0;
								while (true) {
									if (local289 >= local164) {
										continue label55;
									}
									local134[local136++] = Static195.aByteArray51[local289 + 8];
									local289++;
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
			} catch (@Pc(318) IOException local318) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I[BII)Z")
	public boolean method2607(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class96 local6 = this.aClass96_37;
		synchronized (this.aClass96_37) {
			if (arg2 < 0 || this.anInt3465 < arg2) {
				throw new IllegalArgumentException();
			}
			@Pc(30) boolean local30 = this.method2605(true, arg0, arg2, arg1);
			if (!local30) {
				local30 = this.method2605(false, arg0, arg2, arg1);
			}
			return local30;
		}
	}
}
