import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class6_Sub2_Sub1 extends Class6_Sub2 {

	@OriginalMember(owner = "client!ae", name = "y", descriptor = "[[B")
	private byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!ae", name = "J", descriptor = "[Lclient!ps;")
	public Class261[] aClass261Array1;

	@OriginalMember(owner = "client!ae", name = "D", descriptor = "I")
	private final int anInt189;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(I)V")
	public Class6_Sub2_Sub1(@OriginalArg(0) int arg0) {
		this.anInt189 = arg0;
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)Z")
	public boolean method188() {
		if (this.aClass261Array1 != null) {
			return true;
		}
		@Pc(35) int[] local35;
		@Pc(42) int local42;
		if (this.aByteArrayArray6 == null) {
			@Pc(15) Class353 local15 = Static563.aClass353_116;
			synchronized (Static563.aClass353_116) {
				if (!Static563.aClass353_116.method8412(this.anInt189)) {
					return false;
				}
				local35 = Static563.aClass353_116.method8416(this.anInt189);
				this.aByteArrayArray6 = new byte[local35.length][];
				for (local42 = 0; local42 < local35.length; local42++) {
					this.aByteArrayArray6[local42] = Static563.aClass353_116.method8404(this.anInt189, local35[local42]);
				}
			}
		}
		@Pc(69) boolean local69 = true;
		for (@Pc(71) int local71 = 0; local71 < this.aByteArrayArray6.length; local71++) {
			@Pc(78) byte[] local78 = this.aByteArrayArray6[local71];
			@Pc(83) Class6_Sub40 local83 = new Class6_Sub40(local78);
			local83.anInt10169 = 1;
			local42 = local83.method8571();
			@Pc(92) Class353 local92 = Static501.aClass353_101;
			synchronized (Static501.aClass353_101) {
				local69 &= Static501.aClass353_101.method8401(local42);
			}
		}
		if (!local69) {
			return false;
		}
		@Pc(125) Class8 local125 = new Class8();
		@Pc(127) Class353 local127 = Static563.aClass353_116;
		synchronized (Static563.aClass353_116) {
			@Pc(135) int local135 = Static563.aClass353_116.method8422(this.anInt189);
			this.aClass261Array1 = new Class261[local135];
			local35 = Static563.aClass353_116.method8416(this.anInt189);
		}
		for (@Pc(161) int local161 = 0; local161 < local35.length; local161++) {
			@Pc(168) byte[] local168 = this.aByteArrayArray6[local161];
			@Pc(173) Class6_Sub40 local173 = new Class6_Sub40(local168);
			local173.anInt10169 = 1;
			@Pc(180) int local180 = local173.method8571();
			@Pc(182) Class6_Sub44 local182 = null;
			for (@Pc(187) Class6_Sub44 local187 = (Class6_Sub44) local125.method149(); local187 != null; local187 = (Class6_Sub44) local125.method155()) {
				if (local187.anInt9295 == local180) {
					local182 = local187;
					break;
				}
			}
			if (local182 == null) {
				@Pc(207) Class353 local207 = Static501.aClass353_101;
				synchronized (Static501.aClass353_101) {
					local182 = new Class6_Sub44(local180, Static501.aClass353_101.method8419(local180));
				}
				local125.method157(local182);
			}
			this.aClass261Array1[local35[local161]] = new Class261(local168, local182);
		}
		this.aByteArrayArray6 = null;
		return true;
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(II)Z")
	public boolean method190(@OriginalArg(0) int arg0) {
		return this.aClass261Array1[arg0].aBoolean538;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZ)Z")
	public boolean method191(@OriginalArg(0) int arg0) {
		return this.aClass261Array1[arg0].aBoolean537;
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(II)Z")
	public boolean method192(@OriginalArg(0) int arg0) {
		return this.aClass261Array1[arg0].aBoolean536;
	}
}
