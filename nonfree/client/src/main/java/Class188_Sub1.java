import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public final class Class188_Sub1 extends Class188 implements Interface10 {

	@OriginalMember(owner = "client!oea", name = "w", descriptor = "I")
	private int anInt6715;

	@OriginalMember(owner = "client!oea", name = "<init>", descriptor = "(Lclient!no;I[BIZ)V")
	public Class188_Sub1(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt6715 = arg1;
	}

	@OriginalMember(owner = "client!oea", name = "<init>", descriptor = "(Lclient!no;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class188_Sub1(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt6715 = arg1;
	}

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "(I)J")
	@Override
	public long method5607() {
		return 0L;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "([BIII)V")
	@Override
	public void method5605(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method6565(arg2, arg0);
		this.anInt6715 = arg1;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(I)I")
	@Override
	public int method5606() {
		return super.anInt7946;
	}

	@OriginalMember(owner = "client!oea", name = "c", descriptor = "(I)I")
	@Override
	public int method5608() {
		return this.anInt6715;
	}

	@OriginalMember(owner = "client!oea", name = "d", descriptor = "(I)V")
	@Override
	protected void method6567() {
		super.aClass66_Sub3_34.method5418(this);
	}
}
