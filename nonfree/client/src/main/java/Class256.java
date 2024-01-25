import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class256 {

	@OriginalMember(owner = "client!qb", name = "y", descriptor = "I")
	public int anInt7126;

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "Lclient!vi;")
	private final Class332 aClass332_164 = new Class332(64);

	@OriginalMember(owner = "client!qb", name = "r", descriptor = "Lclient!vi;")
	public final Class332 aClass332_165 = new Class332(50);

	@OriginalMember(owner = "client!qb", name = "t", descriptor = "Lclient!gl;")
	public final Class122 aClass122_1 = new Class122(250);

	@OriginalMember(owner = "client!qb", name = "u", descriptor = "Lclient!fc;")
	private final Class96 aClass96_1 = new Class96();

	@OriginalMember(owner = "client!qb", name = "w", descriptor = "Lclient!tn;")
	private final Class307 aClass307_2;

	@OriginalMember(owner = "client!qb", name = "q", descriptor = "I")
	public final int anInt7124;

	@OriginalMember(owner = "client!qb", name = "o", descriptor = "Z")
	private boolean aBoolean496;

	@OriginalMember(owner = "client!qb", name = "j", descriptor = "Lclient!pq;")
	public final Class251 aClass251_118;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "Lclient!pq;")
	private final Class251 aClass251_117;

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
	public final int anInt7112;

	@OriginalMember(owner = "client!qb", name = "v", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray24;

	@OriginalMember(owner = "client!qb", name = "x", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray25;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lclient!uea;IZLclient!tn;Lclient!pq;Lclient!pq;)V")
	public Class256(@OriginalArg(0) Class314 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class307 arg3, @OriginalArg(4) Class251 arg4, @OriginalArg(5) Class251 arg5) {
		this.aClass307_2 = arg3;
		this.anInt7124 = arg1;
		this.aBoolean496 = arg2;
		this.aClass251_118 = arg5;
		this.aClass251_117 = arg4;
		if (this.aClass251_117 == null) {
			this.anInt7112 = 0;
		} else {
			@Pc(49) int local49 = this.aClass251_117.method5847() - 1;
			this.anInt7112 = this.aClass251_117.method5849(local49) + local49 * 256;
		}
		this.aStringArray24 = new String[] { null, null, Static141.aClass104_6.method2145(this.anInt7124), null, null };
		this.aStringArray25 = new String[] { null, null, null, null, Static141.aClass104_7.method2145(this.anInt7124) };
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILclient!oa;IIIILclient!ph;)Lclient!xa;")
	public Class4 method5921(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class246 arg6) {
		this.aClass96_1.aBoolean147 = arg6 != null;
		this.aClass96_1.anInt2254 = arg1;
		this.aClass96_1.anInt2257 = arg0;
		this.aClass96_1.anInt2250 = arg4;
		this.aClass96_1.anInt2255 = arg5;
		this.aClass96_1.anInt2253 = arg2.anInt8715;
		this.aClass96_1.anInt2248 = arg3;
		return (Class4) this.aClass122_1.method2593(this.aClass96_1);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BI)V")
	public void method5922(@OriginalArg(1) int arg0) {
		this.anInt7126 = arg0;
		@Pc(9) Class332 local9 = this.aClass332_165;
		synchronized (this.aClass332_165) {
			this.aClass332_165.method7510();
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZB)V")
	public void method5923(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean496) {
			this.aBoolean496 = arg0;
			this.method5927();
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)Lclient!fs;")
	public Class110 method5924(@OriginalArg(1) int arg0) {
		@Pc(8) Class332 local8 = this.aClass332_164;
		@Pc(18) Class110 local18;
		synchronized (this.aClass332_164) {
			local18 = (Class110) this.aClass332_164.method7502((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class251 local31 = this.aClass251_117;
		@Pc(44) byte[] local44;
		synchronized (this.aClass251_117) {
			local44 = this.aClass251_117.method5860(Static57.method750(arg0), Static68.method885(arg0));
		}
		local18 = new Class110();
		local18.aClass256_1 = this;
		local18.anInt2644 = arg0;
		local18.lb = new String[] { null, null, Static141.aClass104_6.method2145(this.anInt7124), null, null };
		local18.aStringArray13 = new String[] { null, null, null, null, Static141.aClass104_7.method2145(this.anInt7124) };
		if (local44 != null) {
			local18.method2206(new Class6_Sub14(local44));
		}
		local18.method2208();
		if (local18.anInt2673 != -1) {
			local18.method2194(this.method5924(local18.anInt2673), this.method5924(local18.anInt2653));
		}
		if (local18.anInt2617 != -1) {
			local18.method2210(this.method5924(local18.anInt2615), this.method5924(local18.anInt2617));
		}
		if (!this.aBoolean496 && local18.aBoolean180) {
			local18.aString41 = Static141.aClass104_4.method2145(this.anInt7124);
			local18.anIntArray315 = null;
			local18.aBoolean179 = false;
			local18.aStringArray13 = this.aStringArray25;
			local18.lb = this.aStringArray24;
			local18.anInt2643 = 0;
			if (local18.aClass212_8 != null) {
				@Pc(198) boolean local198 = false;
				for (@Pc(203) Class6 local203 = local18.aClass212_8.method5099(); local203 != null; local203 = local18.aClass212_8.method5103()) {
					@Pc(213) Class343 local213 = this.aClass307_2.method6811((int) local203.aLong249);
					if (local213.aBoolean663) {
						local203.method7849();
					} else {
						local198 = true;
					}
				}
				if (!local198) {
					local18.aClass212_8 = null;
				}
			}
		}
		@Pc(238) Class332 local238 = this.aClass332_164;
		synchronized (this.aClass332_164) {
			this.aClass332_164.method7498((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)V")
	public void method5925() {
		@Pc(2) Class332 local2 = this.aClass332_164;
		synchronized (this.aClass332_164) {
			this.aClass332_164.method7497(5);
		}
		local2 = this.aClass332_165;
		synchronized (this.aClass332_165) {
			this.aClass332_165.method7497(5);
		}
		@Pc(46) Class122 local46 = this.aClass122_1;
		synchronized (this.aClass122_1) {
			this.aClass122_1.method2597();
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
	public void method5926() {
		@Pc(2) Class122 local2 = this.aClass122_1;
		synchronized (this.aClass122_1) {
			this.aClass122_1.method2592();
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V")
	public void method5927() {
		@Pc(2) Class332 local2 = this.aClass332_164;
		synchronized (this.aClass332_164) {
			this.aClass332_164.method7510();
		}
		local2 = this.aClass332_165;
		synchronized (this.aClass332_165) {
			this.aClass332_165.method7510();
		}
		@Pc(42) Class122 local42 = this.aClass122_1;
		synchronized (this.aClass122_1) {
			this.aClass122_1.method2592();
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)V")
	public void method5929() {
		@Pc(2) Class332 local2 = this.aClass332_164;
		synchronized (this.aClass332_164) {
			this.aClass332_164.method7512();
		}
		local2 = this.aClass332_165;
		synchronized (this.aClass332_165) {
			this.aClass332_165.method7512();
		}
		@Pc(42) Class122 local42 = this.aClass122_1;
		synchronized (this.aClass122_1) {
			this.aClass122_1.method2595();
		}
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(B)V")
	public void method5930() {
		@Pc(6) Class332 local6 = this.aClass332_165;
		synchronized (this.aClass332_165) {
			this.aClass332_165.method7510();
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!ta;Lclient!ph;Lclient!oa;Lclient!oa;IZIZZIII)Lclient!xa;")
	public Class4 method5931(@OriginalArg(0) Class56 arg0, @OriginalArg(1) Class246 arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) Class121 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(16) Class4 local16 = this.method5921(arg4, arg9, arg2, arg6, arg8, arg10, arg1);
		if (local16 != null) {
			return local16;
		}
		@Pc(31) Class110 local31 = this.method5924(arg4);
		if (arg9 > 1 && local31.anIntArray317 != null) {
			@Pc(41) int local41 = -1;
			for (@Pc(43) int local43 = 0; local43 < 10; local43++) {
				if (local31.anIntArray316[local43] <= arg9 && local31.anIntArray316[local43] != 0) {
					local41 = local31.anIntArray317[local43];
				}
			}
			if (local41 != -1) {
				local31 = this.method5924(local41);
			}
		}
		@Pc(90) int[] local90 = local31.method2213(arg2, arg1, arg7, arg8, arg10, arg0, arg6, arg9, arg3);
		if (local90 == null) {
			return null;
		}
		@Pc(104) Class4 local104;
		if (arg5) {
			local104 = arg3.method7110(local90, 36, 36, 32);
		} else {
			local104 = arg2.method7110(local90, 36, 36, 32);
		}
		if (!arg5) {
			@Pc(120) Class96 local120 = new Class96();
			local120.anInt2255 = arg10;
			local120.anInt2253 = arg2.anInt8715;
			local120.anInt2248 = arg6;
			local120.anInt2250 = arg8;
			local120.anInt2257 = arg4;
			local120.aBoolean147 = arg1 != null;
			local120.anInt2254 = arg9;
			this.aClass122_1.method2594(local104, local120);
		}
		return local104;
	}
}
