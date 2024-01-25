import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public final class Class3_Sub15 extends Class3 {

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
	public final int anInt2466;

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
	public final int anInt2463;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(II)V")
	public Class3_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2466 = arg0;
		this.anInt2463 = arg1;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)I")
	public int method2316() {
		return this.anInt2466 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)Z")
	public boolean method2317() {
		return (this.anInt2466 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)Z")
	public boolean method2318(@OriginalArg(1) int arg0) {
		return (this.anInt2466 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)Z")
	public boolean method2319() {
		return (this.anInt2466 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(Z)Z")
	public boolean method2320() {
		return (this.anInt2466 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(Z)I")
	public int method2322() {
		return Static472.method7115(this.anInt2466);
	}
}
