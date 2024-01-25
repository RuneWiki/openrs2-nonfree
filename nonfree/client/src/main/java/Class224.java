import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public final class Class224 {

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "J")
	public final long aLong190;

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "Lclient!kd;")
	private final Class39_Sub2 aClass39_Sub2_36;

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lclient!kd;JI)V")
	public Class224(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong190 = arg1;
		this.aClass39_Sub2_36 = arg0;
	}

	@OriginalMember(owner = "client!sn", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass39_Sub2_36.method3190(this.aLong190);
		super.finalize();
	}
}
