import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class8_Sub5_Sub21 extends Class8_Sub5 {

	@OriginalMember(owner = "client!wc", name = "v", descriptor = "[[B")
	private byte[][] aByteArrayArray169;

	@OriginalMember(owner = "client!wc", name = "C", descriptor = "[Lclient!nfa;")
	public Class222[] aClass222Array1;

	@OriginalMember(owner = "client!wc", name = "x", descriptor = "I")
	private final int anInt10385;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(I)V")
	public Class8_Sub5_Sub21(@OriginalArg(0) int arg0) {
		this.anInt10385 = arg0;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)Z")
	public boolean method8385(@OriginalArg(0) int arg0) {
		return this.aClass222Array1[arg0].aBoolean486;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(Z)Z")
	public boolean method8386() {
		if (this.aClass222Array1 != null) {
			return true;
		}
		@Pc(35) int[] local35;
		@Pc(42) int local42;
		if (this.aByteArrayArray169 == null) {
			@Pc(15) Class237 local15 = Static522.aClass237_126;
			synchronized (Static522.aClass237_126) {
				if (!Static522.aClass237_126.method6324(this.anInt10385)) {
					return false;
				}
				local35 = Static522.aClass237_126.method6303(this.anInt10385);
				this.aByteArrayArray169 = new byte[local35.length][];
				for (local42 = 0; local42 < local35.length; local42++) {
					this.aByteArrayArray169[local42] = Static522.aClass237_126.method6314(this.anInt10385, local35[local42]);
				}
			}
		}
		@Pc(73) boolean local73 = true;
		for (@Pc(75) int local75 = 0; local75 < this.aByteArrayArray169.length; local75++) {
			@Pc(82) byte[] local82 = this.aByteArrayArray169[local75];
			@Pc(87) Class8_Sub8 local87 = new Class8_Sub8(local82);
			local87.anInt10588 = 1;
			local42 = local87.method8578();
			@Pc(96) Class237 local96 = Static510.aClass237_123;
			synchronized (Static510.aClass237_123) {
				local73 &= Static510.aClass237_123.method6296(local42);
			}
		}
		if (!local73) {
			return false;
		}
		@Pc(129) Class43 local129 = new Class43();
		@Pc(131) Class237 local131 = Static522.aClass237_126;
		synchronized (Static522.aClass237_126) {
			@Pc(139) int local139 = Static522.aClass237_126.method6315(this.anInt10385);
			this.aClass222Array1 = new Class222[local139];
			local35 = Static522.aClass237_126.method6303(this.anInt10385);
		}
		for (local42 = 0; local42 < local35.length; local42++) {
			@Pc(169) byte[] local169 = this.aByteArrayArray169[local42];
			@Pc(174) Class8_Sub8 local174 = new Class8_Sub8(local169);
			local174.anInt10588 = 1;
			@Pc(181) int local181 = local174.method8578();
			@Pc(183) Class8_Sub22 local183 = null;
			for (@Pc(188) Class8_Sub22 local188 = (Class8_Sub22) local129.method1422(); local188 != null; local188 = (Class8_Sub22) local129.method1426()) {
				if (local181 == local188.anInt3692) {
					local183 = local188;
					break;
				}
			}
			if (local183 == null) {
				@Pc(212) Class237 local212 = Static510.aClass237_123;
				synchronized (Static510.aClass237_123) {
					local183 = new Class8_Sub22(local181, Static510.aClass237_123.method6305(local181));
				}
				local129.method1424(local183);
			}
			this.aClass222Array1[local35[local42]] = new Class222(local169, local183);
		}
		this.aByteArrayArray169 = null;
		return true;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZ)Z")
	public boolean method8388(@OriginalArg(0) int arg0) {
		return this.aClass222Array1[arg0].aBoolean488;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(II)Z")
	public boolean method8390(@OriginalArg(1) int arg0) {
		return this.aClass222Array1[arg0].aBoolean487;
	}
}
