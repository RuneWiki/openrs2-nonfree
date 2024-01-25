import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public final class Class193 {

	@OriginalMember(owner = "client!kea", name = "d", descriptor = "J")
	public final long aLong122;

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "Lclient!om;")
	private final Class133_Sub1_Sub2 aClass133_Sub1_Sub2_8;

	@OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(Lclient!om;JI)V")
	public Class193(@OriginalArg(0) Class133_Sub1_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong122 = arg1;
		this.aClass133_Sub1_Sub2_8 = arg0;
	}

	@OriginalMember(owner = "client!kea", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass133_Sub1_Sub2_8.method6288(this.aLong122);
		super.finalize();
	}
}
