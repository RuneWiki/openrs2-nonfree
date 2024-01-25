import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public final class Class134 {

	@OriginalMember(owner = "client!gn", name = "h", descriptor = "Lclient!oea;")
	private final Class87_Sub2 aClass87_Sub2_9;

	@OriginalMember(owner = "client!gn", name = "g", descriptor = "J")
	public final long aLong108;

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lclient!oea;JI)V")
	public Class134(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass87_Sub2_9 = arg0;
		this.aLong108 = arg1;
	}

	@OriginalMember(owner = "client!gn", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass87_Sub2_9.method6173(this.aLong108);
		super.finalize();
	}
}
