import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public final class Class259_Sub2 extends Class259 implements Interface7 {

	@OriginalMember(owner = "client!pa", name = "p", descriptor = "I")
	private int anInt7191;

	static {
		new Class74("", 73);
	}

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lclient!rda;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class259_Sub2(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt7191 = arg1;
	}

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lclient!rda;I[BIZ)V")
	public Class259_Sub2(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt7191 = arg1;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BII[B)V")
	@Override
	public void method6378(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		this.method6375(arg0, arg2);
		this.anInt7191 = arg1;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)I")
	@Override
	public int method6379() {
		return super.anInt7178;
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(B)V")
	@Override
	protected void method6373() {
		super.aClass126_Sub3_28.method7066(this);
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)J")
	@Override
	public long method6381() {
		return 0L;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)I")
	@Override
	public int method6380() {
		return this.anInt7191;
	}
}
