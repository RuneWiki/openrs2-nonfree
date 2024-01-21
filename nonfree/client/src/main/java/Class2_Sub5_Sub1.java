import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class2_Sub5_Sub1 extends Class2_Sub5 {

	@OriginalMember(owner = "client!mb", name = "ec", descriptor = "Lclient!ud;")
	private Class60 aClass60_1;

	@OriginalMember(owner = "client!mb", name = "ic", descriptor = "I")
	private int anInt1821;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(I)V")
	public Class2_Sub5_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(Z)V")
	public void method1299() {
		this.anInt1821 = super.anInt1772 * 8;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I[I)V")
	public void method1301(@OriginalArg(1) int[] arg0) {
		this.aClass60_1 = new Class60(arg0);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZ)V")
	public void method1302(@OriginalArg(0) int arg0) {
		super.aByteArray16[super.anInt1772++] = (byte) (this.aClass60_1.method1947() + arg0);
	}

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "(B)V")
	public void method1303() {
		super.anInt1772 = (this.anInt1821 + 7) / 8;
	}

	@OriginalMember(owner = "client!mb", name = "v", descriptor = "(I)I")
	public int method1306() {
		return super.aByteArray16[super.anInt1772++] - this.aClass60_1.method1947() & 0xFF;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(IZ)I")
	public int method1307(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt1821;
	}

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "(II)I")
	public int method1309(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = this.anInt1821 >> 3;
		@Pc(21) int local21 = 8 - (this.anInt1821 & 0x7);
		@Pc(23) int local23 = 0;
		this.anInt1821 += arg0;
		while (local21 < arg0) {
			local23 += (super.aByteArray16[local13++] & Static105.anIntArray350[local21]) << arg0 - local21;
			arg0 -= local21;
			local21 = 8;
		}
		if (local21 == arg0) {
			local23 += Static105.anIntArray350[local21] & super.aByteArray16[local13];
		} else {
			local23 += Static105.anIntArray350[arg0] & super.aByteArray16[local13] >> local21 - arg0;
		}
		return local23;
	}
}
