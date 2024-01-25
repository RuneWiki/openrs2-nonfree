import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public final class Class184 {

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "Lclient!nq;")
	private final Class167_Sub1 aClass167_Sub1_29;

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "J")
	public final long aLong175;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lclient!nq;JI)V")
	public Class184(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass167_Sub1_29 = arg0;
		this.aLong175 = arg1;
	}

	@OriginalMember(owner = "client!pb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass167_Sub1_29.method4007(this.aLong175);
		super.finalize();
	}
}
