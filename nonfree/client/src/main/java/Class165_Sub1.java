import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ika")
public final class Class165_Sub1 extends Class165 implements Interface17 {

	@OriginalMember(owner = "client!ika", name = "q", descriptor = "I")
	private int anInt4819;

	@OriginalMember(owner = "client!ika", name = "<init>", descriptor = "(Lclient!ck;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class165_Sub1(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt4819 = arg1;
	}

	@OriginalMember(owner = "client!ika", name = "<init>", descriptor = "(Lclient!ck;I[BIZ)V")
	public Class165_Sub1(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt4819 = arg1;
	}

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(I)I")
	@Override
	public int method6470() {
		return this.anInt4819;
	}

	@OriginalMember(owner = "client!ika", name = "b", descriptor = "(B)I")
	@Override
	public int method6468() {
		return super.anInt8208;
	}

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(B)J")
	@Override
	public long method6467() {
		return 0L;
	}

	@OriginalMember(owner = "client!ika", name = "d", descriptor = "(B)V")
	@Override
	protected void method7023() {
		super.aClass65_Sub1_31.method1269(this);
	}

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "([BIII)V")
	@Override
	public void method6469(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method7022(arg0, arg1);
		this.anInt4819 = arg2;
	}
}
