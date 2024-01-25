import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public final class Class195 {

	@OriginalMember(owner = "client!kga", name = "h", descriptor = "J")
	public final long aLong154;

	@OriginalMember(owner = "client!kga", name = "b", descriptor = "Lclient!jc;")
	private final Class65_Sub2_Sub2 aClass65_Sub2_Sub2_5;

	@OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(Lclient!jc;JI)V")
	public Class195(@OriginalArg(0) Class65_Sub2_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong154 = arg1;
		this.aClass65_Sub2_Sub2_5 = arg0;
	}

	@OriginalMember(owner = "client!kga", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass65_Sub2_Sub2_5.method4486(this.aLong154);
		super.finalize();
	}
}
