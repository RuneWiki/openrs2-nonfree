import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kma")
public final class Class21_Sub13 extends Class21 {

	@OriginalMember(owner = "client!kma", name = "<init>", descriptor = "(ILclient!eha;)V")
	public Class21_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!kma", name = "<init>", descriptor = "(Lclient!eha;)V")
	public Class21_Sub13(@OriginalArg(0) Class3_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!kma", name = "d", descriptor = "(II)V")
	@Override
	protected void method9240(@OriginalArg(1) int arg0) {
		super.anInt10876 = arg0;
	}

	@OriginalMember(owner = "client!kma", name = "c", descriptor = "(II)I")
	@Override
	public int method9238(@OriginalArg(1) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!kma", name = "a", descriptor = "(I)V")
	@Override
	public void method9235() {
		if (super.anInt10876 < 0 || super.anInt10876 > 4) {
			super.anInt10876 = this.method9239();
		}
	}

	@OriginalMember(owner = "client!kma", name = "a", descriptor = "(B)I")
	@Override
	protected int method9239() {
		return 0;
	}

	@OriginalMember(owner = "client!kma", name = "b", descriptor = "(I)I")
	public int method4944() {
		return super.anInt10876;
	}
}
