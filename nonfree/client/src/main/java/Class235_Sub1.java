import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public final class Class235_Sub1 extends Class235 implements Interface12 {

	@OriginalMember(owner = "client!mga", name = "o", descriptor = "I")
	private int anInt6649;

	@OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(Lclient!pi;I[BIZ)V")
	public Class235_Sub1(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt6649 = arg1;
	}

	@OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(Lclient!pi;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class235_Sub1(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt6649 = arg1;
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "([BIII)V")
	@Override
	public void method5812(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method6108(arg2, arg0);
		this.anInt6649 = arg1;
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(B)I")
	@Override
	public int method5813() {
		return super.anInt6998;
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(Z)V")
	@Override
	protected void method6110() {
		super.aClass144_Sub3_28.method6985(this);
	}

	@OriginalMember(owner = "client!mga", name = "b", descriptor = "(B)I")
	@Override
	public int method5811() {
		return this.anInt6649;
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(I)J")
	@Override
	public long method5810() {
		return 0L;
	}
}
