import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class1_Sub17_Sub1 extends Class1_Sub17 {

	@OriginalMember(owner = "client!md", name = "Lb", descriptor = "I")
	private int anInt2698;

	@OriginalMember(owner = "client!md", name = "Wb", descriptor = "Lclient!gh;")
	private Class43 aClass43_1;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(I)V")
	public Class1_Sub17_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!md", name = "d", descriptor = "(BI)I")
	public int method2181(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt2698 >> 3;
		@Pc(26) int local26 = 8 - (this.anInt2698 & 0x7);
		this.anInt2698 += arg0;
		@Pc(34) int local34 = 0;
		while (local26 < arg0) {
			local34 += (super.aByteArray40[local10++] & Static105.anIntArray199[local26]) << arg0 - local26;
			arg0 -= local26;
			local26 = 8;
		}
		if (arg0 == local26) {
			local34 += super.aByteArray40[local10] & Static105.anIntArray199[local26];
		} else {
			local34 += super.aByteArray40[local10] >> local26 - arg0 & Static105.anIntArray199[arg0];
		}
		return local34;
	}

	@OriginalMember(owner = "client!md", name = "m", descriptor = "(II)V")
	public void method2182(@OriginalArg(0) int arg0) {
		super.aByteArray40[super.anInt2656++] = (byte) (this.aClass43_1.method1044() + arg0);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ZI)I")
	public int method2186(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt2698;
	}

	@OriginalMember(owner = "client!md", name = "i", descriptor = "(B)I")
	public int method2187() {
		return super.aByteArray40[super.anInt2656++] - this.aClass43_1.method1044() & 0xFF;
	}

	@OriginalMember(owner = "client!md", name = "u", descriptor = "(I)V")
	public void method2188() {
		super.anInt2656 = (this.anInt2698 + 7) / 8;
	}

	@OriginalMember(owner = "client!md", name = "v", descriptor = "(I)V")
	public void method2189() {
		this.anInt2698 = super.anInt2656 * 8;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BI[BI)V")
	public void method2190(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			arg0[local3] = (byte) (super.aByteArray40[super.anInt2656++] - this.aClass43_1.method1044());
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "([IB)V")
	public void method2191(@OriginalArg(0) int[] arg0) {
		this.aClass43_1 = new Class43(arg0);
	}
}
