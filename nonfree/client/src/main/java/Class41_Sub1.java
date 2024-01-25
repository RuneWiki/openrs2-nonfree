import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public final class Class41_Sub1 extends Class41 implements Interface1 {

	@OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
	private int anInt796;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lclient!ef;ILclient!jaggl/memory/NativeBuffer;)V")
	public Class41_Sub1(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2) {
		super(arg0, arg2);
		this.anInt796 = arg1;
	}

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lclient!ef;I[BI)V")
	public Class41_Sub1(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt796 = arg1;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z)I")
	@Override
	public int method693() {
		return 0;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)I")
	@Override
	public int method690() {
		return this.anInt796;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(I[BII)V")
	@Override
	public void method691(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method2308(arg0, arg2);
		this.anInt796 = arg1;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)J")
	@Override
	public long method692() {
		return super.aNativeBuffer3.c();
	}
}
