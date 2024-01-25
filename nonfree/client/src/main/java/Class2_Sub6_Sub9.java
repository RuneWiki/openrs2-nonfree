import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gw")
public final class Class2_Sub6_Sub9 extends Class2_Sub6 {

	@OriginalMember(owner = "client!gw", name = "y", descriptor = "[[B")
	private byte[][] aByteArrayArray11;

	@OriginalMember(owner = "client!gw", name = "A", descriptor = "[Lclient!gk;")
	public Class120[] aClass120Array1;

	@OriginalMember(owner = "client!gw", name = "w", descriptor = "I")
	private final int anInt4562;

	@OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(I)V")
	public Class2_Sub6_Sub9(@OriginalArg(0) int arg0) {
		this.anInt4562 = arg0;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(BI)Z")
	public boolean method3987(@OriginalArg(1) int arg0) {
		return this.aClass120Array1[arg0].aBoolean328;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)Z")
	public boolean method3988() {
		if (this.aClass120Array1 != null) {
			return true;
		}
		@Pc(35) int[] local35;
		@Pc(42) int local42;
		if (this.aByteArrayArray11 == null) {
			@Pc(15) Class157 local15 = Static388.aClass157_196;
			synchronized (Static388.aClass157_196) {
				if (!Static388.aClass157_196.method4562(this.anInt4562)) {
					return false;
				}
				local35 = Static388.aClass157_196.method4550(this.anInt4562);
				this.aByteArrayArray11 = new byte[local35.length][];
				for (local42 = 0; local42 < local35.length; local42++) {
					this.aByteArrayArray11[local42] = Static388.aClass157_196.method4564(this.anInt4562, local35[local42]);
				}
			}
		}
		@Pc(73) boolean local73 = true;
		for (@Pc(75) int local75 = 0; local75 < this.aByteArrayArray11.length; local75++) {
			@Pc(82) byte[] local82 = this.aByteArrayArray11[local75];
			@Pc(87) Class2_Sub11 local87 = new Class2_Sub11(local82);
			local87.anInt10066 = 1;
			local42 = local87.method8326();
			@Pc(96) Class157 local96 = Static280.aClass157_136;
			synchronized (Static280.aClass157_136) {
				local73 &= Static280.aClass157_136.method4575(local42);
			}
		}
		if (!local73) {
			return false;
		}
		@Pc(125) Class341 local125 = new Class341();
		@Pc(127) Class157 local127 = Static388.aClass157_196;
		synchronized (Static388.aClass157_196) {
			@Pc(135) int local135 = Static388.aClass157_196.method4561(this.anInt4562);
			this.aClass120Array1 = new Class120[local135];
			local35 = Static388.aClass157_196.method4550(this.anInt4562);
		}
		for (local42 = 0; local42 < local35.length; local42++) {
			@Pc(168) byte[] local168 = this.aByteArrayArray11[local42];
			@Pc(173) Class2_Sub11 local173 = new Class2_Sub11(local168);
			local173.anInt10066 = 1;
			@Pc(180) int local180 = local173.method8326();
			@Pc(182) Class2_Sub42 local182 = null;
			for (@Pc(187) Class2_Sub42 local187 = (Class2_Sub42) local125.method8524(); local187 != null; local187 = (Class2_Sub42) local125.method8519()) {
				if (local187.anInt8911 == local180) {
					local182 = local187;
					break;
				}
			}
			if (local182 == null) {
				@Pc(207) Class157 local207 = Static280.aClass157_136;
				synchronized (Static280.aClass157_136) {
					local182 = new Class2_Sub42(local180, Static280.aClass157_136.method4569(local180));
				}
				local125.method8528(local182);
			}
			this.aClass120Array1[local35[local42]] = new Class120(local168, local182);
		}
		this.aByteArrayArray11 = null;
		return true;
	}

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "(II)Z")
	public boolean method3991(@OriginalArg(0) int arg0) {
		return this.aClass120Array1[arg0].aBoolean330;
	}

	@OriginalMember(owner = "client!gw", name = "d", descriptor = "(II)Z")
	public boolean method3992(@OriginalArg(0) int arg0) {
		return this.aClass120Array1[arg0].aBoolean329;
	}
}
