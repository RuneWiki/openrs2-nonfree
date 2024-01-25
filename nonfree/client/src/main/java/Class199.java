import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class199 {

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "Lclient!jm;")
	private Class107 aClass107_5 = null;

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
	private int anInt6134 = 65000;

	@OriginalMember(owner = "client!ug", name = "j", descriptor = "Lclient!jm;")
	private Class107 aClass107_6 = null;

	@OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
	private final int anInt6135;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(ILclient!jm;Lclient!jm;I)V")
	public Class199(@OriginalArg(0) int arg0, @OriginalArg(1) Class107 arg1, @OriginalArg(2) Class107 arg2, @OriginalArg(3) int arg3) {
		this.aClass107_5 = arg1;
		this.anInt6134 = arg3;
		this.aClass107_6 = arg2;
		this.anInt6135 = arg0;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "([BIII)Z")
	public boolean method5478(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class107 local6 = this.aClass107_5;
		synchronized (this.aClass107_5) {
			if (arg2 < 0 || arg2 > this.anInt6134) {
				throw new IllegalArgumentException();
			}
			@Pc(35) boolean local35 = this.method5481(true, arg0, arg2, arg1);
			if (!local35) {
				local35 = this.method5481(false, arg0, arg2, arg1);
			}
			return local35;
		}
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(II)[B")
	public byte[] method5480(@OriginalArg(0) int arg0) {
		@Pc(8) Class107 local8 = this.aClass107_5;
		synchronized (this.aClass107_5) {
			try {
				if (this.aClass107_6.method3003() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass107_6.method3004((long) (arg0 * 6));
				this.aClass107_6.method3007(Static327.aByteArray196, 0, 6);
				@Pc(71) int local71 = (Static327.aByteArray196[2] & 0xFF) + ((Static327.aByteArray196[1] & 0xFF) << 8) + ((Static327.aByteArray196[0] & 0xFF) << 16);
				@Pc(95) int local95 = ((Static327.aByteArray196[3] & 0xFF) << 16) - (-((Static327.aByteArray196[4] & 0xFF) << 8) - (Static327.aByteArray196[5] & 0xFF));
				if (local71 < 0 || local71 > this.anInt6134) {
					return null;
				} else if (local95 > 0 && this.aClass107_5.method3003() / 520L >= (long) local95) {
					@Pc(139) byte[] local139 = new byte[local71];
					@Pc(141) int local141 = 0;
					@Pc(143) int local143 = 0;
					label55: while (local141 < local71) {
						if (local95 == 0) {
							return null;
						}
						this.aClass107_5.method3004((long) (local95 * 520));
						@Pc(169) int local169 = local71 - local141;
						if (local169 > 512) {
							local169 = 512;
						}
						this.aClass107_5.method3007(Static327.aByteArray196, 0, local169 + 8);
						@Pc(198) int local198 = ((Static327.aByteArray196[0] & 0xFF) << 8) + (Static327.aByteArray196[1] & 0xFF);
						@Pc(213) int local213 = ((Static327.aByteArray196[2] & 0xFF) << 8) + (Static327.aByteArray196[3] & 0xFF);
						@Pc(236) int local236 = ((Static327.aByteArray196[4] & 0xFF) << 16) + ((Static327.aByteArray196[5] & 0xFF) << 8) + (Static327.aByteArray196[6] & 0xFF);
						@Pc(242) int local242 = Static327.aByteArray196[7] & 0xFF;
						if (arg0 == local198 && local143 == local213 && this.anInt6135 == local242) {
							if (local236 >= 0 && (long) local236 <= this.aClass107_5.method3003() / 520L) {
								local95 = local236;
								local143++;
								@Pc(289) int local289 = 0;
								while (true) {
									if (local169 <= local289) {
										continue label55;
									}
									local139[local141++] = Static327.aByteArray196[local289 + 8];
									local289++;
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
			} catch (@Pc(318) IOException local318) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z[BIII)Z")
	private boolean method5481(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class107 local13 = this.aClass107_5;
		synchronized (this.aClass107_5) {
			try {
				@Pc(27) int local27;
				if (arg0) {
					if ((long) (arg3 * 6 + 6) > this.aClass107_6.method3003()) {
						return false;
					}
					this.aClass107_6.method3004((long) (arg3 * 6));
					this.aClass107_6.method3007(Static327.aByteArray196, 0, 6);
					local27 = (Static327.aByteArray196[5] & 0xFF) + ((Static327.aByteArray196[4] & 0xFF) << 8) + ((Static327.aByteArray196[3] & 0xFF) << 16);
					if (local27 <= 0 || this.aClass107_5.method3003() / 520L < (long) local27) {
						return false;
					}
				} else {
					local27 = (int) ((this.aClass107_5.method3003() + 519L) / 520L);
					if (local27 == 0) {
						local27 = 1;
					}
				}
				Static327.aByteArray196[3] = (byte) (local27 >> 16);
				Static327.aByteArray196[2] = (byte) arg2;
				Static327.aByteArray196[5] = (byte) local27;
				Static327.aByteArray196[1] = (byte) (arg2 >> 8);
				Static327.aByteArray196[4] = (byte) (local27 >> 8);
				Static327.aByteArray196[0] = (byte) (arg2 >> 16);
				this.aClass107_6.method3004((long) (arg3 * 6));
				this.aClass107_6.method3000(0, 6, Static327.aByteArray196);
				@Pc(170) int local170 = 0;
				@Pc(172) int local172 = 0;
				while (local170 < arg2) {
					@Pc(176) int local176 = 0;
					@Pc(211) int local211;
					if (arg0) {
						this.aClass107_5.method3004((long) (local27 * 520));
						try {
							this.aClass107_5.method3007(Static327.aByteArray196, 0, 8);
						} catch (@Pc(195) EOFException local195) {
							return true;
						}
						local211 = (Static327.aByteArray196[1] & 0xFF) + ((Static327.aByteArray196[0] & 0xFF) << 8);
						local176 = (Static327.aByteArray196[6] & 0xFF) + ((Static327.aByteArray196[5] & 0xFF) << 8) + ((Static327.aByteArray196[4] & 0xFF) << 16);
						@Pc(247) int local247 = (Static327.aByteArray196[3] & 0xFF) + ((Static327.aByteArray196[2] & 0xFF) << 8);
						@Pc(253) int local253 = Static327.aByteArray196[7] & 0xFF;
						if (local211 != arg3 || local247 != local172 || this.anInt6135 != local253) {
							return false;
						}
						if (local176 < 0 || this.aClass107_5.method3003() / 520L < (long) local176) {
							return false;
						}
					}
					if (local176 == 0) {
						arg0 = false;
						local176 = (int) ((this.aClass107_5.method3003() + 519L) / 520L);
						if (local176 == 0) {
							local176++;
						}
						if (local176 == local27) {
							local176++;
						}
					}
					Static327.aByteArray196[0] = (byte) (arg3 >> 8);
					Static327.aByteArray196[1] = (byte) arg3;
					Static327.aByteArray196[2] = (byte) (local172 >> 8);
					if (arg2 - local170 <= 512) {
						local176 = 0;
					}
					Static327.aByteArray196[3] = (byte) local172;
					Static327.aByteArray196[7] = (byte) this.anInt6135;
					Static327.aByteArray196[4] = (byte) (local176 >> 16);
					Static327.aByteArray196[5] = (byte) (local176 >> 8);
					Static327.aByteArray196[6] = (byte) local176;
					this.aClass107_5.method3004((long) (local27 * 520));
					this.aClass107_5.method3000(0, 8, Static327.aByteArray196);
					local211 = arg2 - local170;
					if (local211 > 512) {
						local211 = 512;
					}
					this.aClass107_5.method3000(local170, local211, arg1);
					local170 += local211;
					local172++;
					local27 = local176;
				}
				return true;
			} catch (@Pc(441) IOException local441) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ug", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt6135;
	}
}
