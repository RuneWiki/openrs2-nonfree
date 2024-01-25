import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public final class Class266_Sub1 extends Class266 implements Interface9 {

	@OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
	private int anInt7533;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lclient!dia;I[BIZ)V")
	public Class266_Sub1(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt7533 = arg1;
	}

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lclient!dia;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class266_Sub1(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt7533 = arg1;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)I")
	@Override
	public int method8394() {
		return super.anInt7687;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)J")
	@Override
	public long method8393() {
		return 0L;
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)V")
	@Override
	protected void method6785() {
		super.aClass13_Sub2_32.method2022(this);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)I")
	@Override
	public int method8392() {
		return this.anInt7533;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "([BIII)V")
	@Override
	public void method8391(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method6782(arg0, arg2);
		this.anInt7533 = arg1;
	}
}
