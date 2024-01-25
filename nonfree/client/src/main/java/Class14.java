import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public abstract class Class14 {

	@OriginalMember(owner = "client!eea", name = "e", descriptor = "Lclient!kda;")
	protected final Class6_Sub33 aClass6_Sub33_31;

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "I")
	protected int anInt10543;

	@OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(Lclient!kda;)V")
	public Class14(@OriginalArg(0) Class6_Sub33 arg0) {
		this.aClass6_Sub33_31 = arg0;
		this.anInt10543 = this.method8573();
	}

	@OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(ILclient!kda;)V")
	public Class14(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub33 arg1) {
		this.aClass6_Sub33_31 = arg1;
		this.anInt10543 = arg0;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(II)V")
	protected abstract void method8571(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(B)V")
	public abstract void method8572();

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(I)I")
	protected abstract int method8573();

	@OriginalMember(owner = "client!eea", name = "b", descriptor = "(II)V")
	public final void method8575(@OriginalArg(0) int arg0) {
		if (this.method8577(arg0) != 3) {
			this.method8571(arg0);
		}
	}

	@OriginalMember(owner = "client!eea", name = "c", descriptor = "(II)I")
	public abstract int method8577(@OriginalArg(0) int arg0);
}
