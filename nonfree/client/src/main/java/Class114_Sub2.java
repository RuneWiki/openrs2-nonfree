import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public final class Class114_Sub2 extends Class114 implements Interface14 {

	@OriginalMember(owner = "client!kca", name = "h", descriptor = "I")
	private int anInt5320;

	@OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(Lclient!kfa;I[BI)V")
	public Class114_Sub2(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt5320 = arg1;
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(B)I")
	@Override
	public int method4148() {
		return this.anInt5320;
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "([BIII)V")
	@Override
	public void method4147(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method4145(arg0, arg1);
		this.anInt5320 = 5123;
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(I)J")
	@Override
	public long method4146() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(Z)I")
	@Override
	public int method4149() {
		return 0;
	}
}
