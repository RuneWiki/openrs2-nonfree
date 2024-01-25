import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public final class Class130 {

	@OriginalMember(owner = "client!ji", name = "h", descriptor = "J")
	public final long aLong108;

	@OriginalMember(owner = "client!ji", name = "g", descriptor = "Lclient!ef;")
	private final Class49_Sub2 aClass49_Sub2_20;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lclient!ef;JI)V")
	public Class130(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong108 = arg1;
		this.aClass49_Sub2_20 = arg0;
	}

	@OriginalMember(owner = "client!ji", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass49_Sub2_20.method1658(this.aLong108);
		super.finalize();
	}
}
