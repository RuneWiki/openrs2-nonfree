import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bs")
public final class Class3_Sub11_Sub1 extends Class3_Sub11 {

	@OriginalMember(owner = "client!bs", name = "z", descriptor = "[[B")
	private byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!bs", name = "F", descriptor = "[Lclient!ap;")
	public Class20[] aClass20Array1;

	@OriginalMember(owner = "client!bs", name = "A", descriptor = "I")
	private final int anInt1106;

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(I)V")
	public Class3_Sub11_Sub1(@OriginalArg(0) int arg0) {
		this.anInt1106 = arg0;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(II)Z")
	public boolean method1176(@OriginalArg(0) int arg0) {
		return this.aClass20Array1[arg0].aBoolean39;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(BI)Z")
	public boolean method1177(@OriginalArg(1) int arg0) {
		return this.aClass20Array1[arg0].aBoolean40;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(ZI)Z")
	public boolean method1178(@OriginalArg(1) int arg0) {
		return this.aClass20Array1[arg0].aBoolean41;
	}

	@OriginalMember(owner = "client!bs", name = "d", descriptor = "(B)Z")
	public boolean method1180() {
		if (this.aClass20Array1 != null) {
			return true;
		}
		@Pc(35) int[] local35;
		@Pc(42) int local42;
		if (this.aByteArrayArray4 == null) {
			@Pc(15) Class15 local15 = Static499.aClass15_126;
			synchronized (Static499.aClass15_126) {
				if (!Static499.aClass15_126.method509(this.anInt1106)) {
					return false;
				}
				local35 = Static499.aClass15_126.method530(this.anInt1106);
				this.aByteArrayArray4 = new byte[local35.length][];
				for (local42 = 0; local42 < local35.length; local42++) {
					this.aByteArrayArray4[local42] = Static499.aClass15_126.method517(local35[local42], this.anInt1106);
				}
			}
		}
		@Pc(73) boolean local73 = true;
		for (@Pc(75) int local75 = 0; local75 < this.aByteArrayArray4.length; local75++) {
			@Pc(82) byte[] local82 = this.aByteArrayArray4[local75];
			@Pc(87) Class3_Sub25 local87 = new Class3_Sub25(local82);
			local87.anInt9765 = 1;
			local42 = local87.method8593();
			@Pc(96) Class15 local96 = Static676.aClass15_166;
			synchronized (Static676.aClass15_166) {
				local73 &= Static676.aClass15_166.method526(local42);
			}
		}
		if (!local73) {
			return false;
		}
		@Pc(125) Class338 local125 = new Class338();
		@Pc(132) Class15 local132 = Static499.aClass15_126;
		synchronized (Static499.aClass15_126) {
			@Pc(140) int local140 = Static499.aClass15_126.method512(this.anInt1106);
			this.aClass20Array1 = new Class20[local140];
			local35 = Static499.aClass15_126.method530(this.anInt1106);
		}
		for (local42 = 0; local42 < local35.length; local42++) {
			@Pc(165) byte[] local165 = this.aByteArrayArray4[local42];
			@Pc(170) Class3_Sub25 local170 = new Class3_Sub25(local165);
			local170.anInt9765 = 1;
			@Pc(177) int local177 = local170.method8593();
			@Pc(179) Class3_Sub55 local179 = null;
			for (@Pc(184) Class3_Sub55 local184 = (Class3_Sub55) local125.method8177(); local184 != null; local184 = (Class3_Sub55) local125.method8168()) {
				if (local184.anInt10567 == local177) {
					local179 = local184;
					break;
				}
			}
			if (local179 == null) {
				@Pc(208) Class15 local208 = Static676.aClass15_166;
				synchronized (Static676.aClass15_166) {
					local179 = new Class3_Sub55(local177, Static676.aClass15_166.method536(local177));
				}
				local125.method8171(local179);
			}
			this.aClass20Array1[local35[local42]] = new Class20(local165, local179);
		}
		this.aByteArrayArray4 = null;
		return true;
	}
}
