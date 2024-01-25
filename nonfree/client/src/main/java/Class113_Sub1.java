import java.util.BitSet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public final class Class113_Sub1 extends Class113 implements Interface17 {

	@OriginalMember(owner = "client!fba", name = "o", descriptor = "I")
	private int anInt2871;

	static {
		new BitSet(65536);
	}

	@OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(Lclient!hk;I[BIZ)V")
	public Class113_Sub1(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt2871 = arg1;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(Z[BII)V")
	@Override
	public void method7366(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method5253(arg1, arg0);
		this.anInt2871 = 5123;
	}

	@OriginalMember(owner = "client!fba", name = "b", descriptor = "(I)I")
	@Override
	public int method7365() {
		return super.anInt6272;
	}

	@OriginalMember(owner = "client!fba", name = "d", descriptor = "(I)V")
	@Override
	protected void method5250() {
		super.aClass16_Sub2_32.method3619(this);
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(I)J")
	@Override
	public long method7364() {
		return 0L;
	}

	@OriginalMember(owner = "client!fba", name = "c", descriptor = "(I)I")
	@Override
	public int method7367() {
		return this.anInt2871;
	}
}
