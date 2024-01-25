import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public final class Class28_Sub2 extends Class28 implements Interface7 {

	@OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
	private int anInt7806;

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lclient!us;I[BI)V")
	public Class28_Sub2(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt7806 = arg1;
	}

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lclient!us;ILclient!jaclib/memory/Buffer;)V")
	public Class28_Sub2(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt7806 = arg1;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)I")
	@Override
	public int method6583() {
		return this.anInt7806;
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(B)I")
	@Override
	public int method6581() {
		return 0;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)J")
	@Override
	public long method6580() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "([BIIB)V")
	@Override
	public void method6582(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method6579(arg0, arg1);
		this.anInt7806 = arg2;
	}
}
