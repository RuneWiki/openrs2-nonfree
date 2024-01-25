import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class2_Sub3_Sub19 extends Class2_Sub3 {

	@OriginalMember(owner = "client!wa", name = "y", descriptor = "[[B")
	private byte[][] aByteArrayArray37;

	@OriginalMember(owner = "client!wa", name = "z", descriptor = "[Lclient!gw;")
	public Class132[] aClass132Array1;

	@OriginalMember(owner = "client!wa", name = "x", descriptor = "I")
	private final int anInt9344;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(I)V")
	public Class2_Sub3_Sub19(@OriginalArg(0) int arg0) {
		this.anInt9344 = arg0;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IB)Z")
	public boolean method7768(@OriginalArg(0) int arg0) {
		return this.aClass132Array1[arg0].aBoolean315;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)Z")
	public boolean method7770(@OriginalArg(0) int arg0) {
		return this.aClass132Array1[arg0].aBoolean317;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(BI)Z")
	public boolean method7771(@OriginalArg(1) int arg0) {
		return this.aClass132Array1[arg0].aBoolean316;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)Z")
	public boolean method7772() {
		if (this.aClass132Array1 != null) {
			return true;
		}
		@Pc(39) int[] local39;
		@Pc(46) int local46;
		if (this.aByteArrayArray37 == null) {
			@Pc(15) Class259 local15 = Static113.aClass259_45;
			synchronized (Static113.aClass259_45) {
				if (!Static113.aClass259_45.method5970(this.anInt9344)) {
					return false;
				}
				local39 = Static113.aClass259_45.method5973(this.anInt9344);
				this.aByteArrayArray37 = new byte[local39.length][];
				for (local46 = 0; local46 < local39.length; local46++) {
					this.aByteArrayArray37[local46] = Static113.aClass259_45.method5985(local39[local46], this.anInt9344);
				}
			}
		}
		@Pc(73) boolean local73 = true;
		for (@Pc(75) int local75 = 0; local75 < this.aByteArrayArray37.length; local75++) {
			@Pc(82) byte[] local82 = this.aByteArrayArray37[local75];
			@Pc(87) Class2_Sub15 local87 = new Class2_Sub15(local82);
			local87.anInt5241 = 1;
			local46 = local87.method4294();
			@Pc(96) Class259 local96 = Static429.aClass259_134;
			synchronized (Static429.aClass259_134) {
				local73 &= Static429.aClass259_134.method5988(local46);
			}
		}
		if (!local73) {
			return false;
		}
		@Pc(129) Class8 local129 = new Class8();
		@Pc(131) Class259 local131 = Static113.aClass259_45;
		synchronized (Static113.aClass259_45) {
			@Pc(139) int local139 = Static113.aClass259_45.method5969(this.anInt9344);
			this.aClass132Array1 = new Class132[local139];
			local39 = Static113.aClass259_45.method5973(this.anInt9344);
		}
		for (local46 = 0; local46 < local39.length; local46++) {
			@Pc(164) byte[] local164 = this.aByteArrayArray37[local46];
			@Pc(169) Class2_Sub15 local169 = new Class2_Sub15(local164);
			local169.anInt5241 = 1;
			@Pc(176) int local176 = local169.method4294();
			@Pc(178) Class2_Sub25 local178 = null;
			for (@Pc(183) Class2_Sub25 local183 = (Class2_Sub25) local129.method210(); local183 != null; local183 = (Class2_Sub25) local129.method218()) {
				if (local183.anInt4680 == local176) {
					local178 = local183;
					break;
				}
			}
			if (local178 == null) {
				@Pc(203) Class259 local203 = Static429.aClass259_134;
				synchronized (Static429.aClass259_134) {
					local178 = new Class2_Sub25(local176, Static429.aClass259_134.method5964(local176));
				}
				local129.method212(local178);
			}
			this.aClass132Array1[local39[local46]] = new Class132(local164, local178);
		}
		this.aByteArrayArray37 = null;
		return true;
	}
}
