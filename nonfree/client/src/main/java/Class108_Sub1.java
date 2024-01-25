import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class108_Sub1 extends Class108 implements Interface18 {

	@OriginalMember(owner = "client!fi", name = "u", descriptor = "[J")
	public static final long[] aLongArray2 = new long[256];

	@OriginalMember(owner = "client!fi", name = "p", descriptor = "I")
	private int anInt3029;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(8) long local8 = (long) local4;
			for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
				if ((local8 & 0x1L) == 1L) {
					local8 = local8 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local8 >>>= 0x1;
				}
			}
			aLongArray2[local4] = local8;
		}
	}

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lclient!ap;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class108_Sub1(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt3029 = arg1;
	}

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lclient!ap;I[BIZ)V")
	public Class108_Sub1(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt3029 = arg1;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BI[BI)V")
	@Override
	public void method3933(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		this.method7294(arg0, arg1);
		this.anInt3029 = arg2;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)J")
	@Override
	public long method3935() {
		return 0L;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)I")
	@Override
	public int method3934() {
		return super.anInt8727;
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)I")
	@Override
	public int method3936() {
		return this.anInt3029;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)V")
	@Override
	protected void method7293() {
		super.aClass9_Sub2_34.method810(this);
	}
}
