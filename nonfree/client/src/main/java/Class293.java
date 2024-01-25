import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class293 {

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
	private int anInt8139;

	@OriginalMember(owner = "client!ug", name = "j", descriptor = "J")
	private long aLong344;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Lclient!gh;)V")
	public Class293(@OriginalArg(0) Class107 arg0) {
		this.anInt8139 = 1;
		this.aLong344 = arg0.anInt2917;
	}

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "([Lclient!gh;)V")
	public Class293(@OriginalArg(0) Class107[] arg0) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			this.method6712(arg0[local5]);
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)I")
	public int method6709() {
		return this.anInt8139;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)Lclient!gh;")
	public Class107 method6711(@OriginalArg(0) int arg0) {
		return Static160.method2491()[this.method6715(arg0)];
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BLclient!gh;)V")
	private void method6712(@OriginalArg(1) Class107 arg0) {
		this.aLong344 |= arg0.anInt2917 << Static160.anInt2920 * this.anInt8139++;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BI)I")
	private int method6715(@OriginalArg(1) int arg0) {
		return (int) (this.aLong344 >> arg0 * Static160.anInt2920) & 0xF;
	}
}
