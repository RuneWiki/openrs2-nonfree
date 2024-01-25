import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public abstract class Class3_Sub7 extends Class3 {

	@OriginalMember(owner = "client!dda", name = "u", descriptor = "Z")
	public boolean aBoolean47;

	@OriginalMember(owner = "client!dda", name = "p", descriptor = "Lclient!dia;")
	protected final Class13_Sub2 aClass13_Sub2_3;

	@OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Lclient!dia;)V")
	public Class3_Sub7(@OriginalArg(0) Class13_Sub2 arg0) {
		this.aClass13_Sub2_3 = arg0;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)Z")
	public final boolean method774() {
		return this.aBoolean47;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(BLclient!tca;ILclient!tca;)V")
	public abstract void method775(@OriginalArg(1) Class85_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class85_Sub3 arg2);

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(I)Z")
	public abstract boolean method776();

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(III)V")
	public abstract void method777(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!dda", name = "d", descriptor = "(I)I")
	public int method778() {
		return 0;
	}

	@OriginalMember(owner = "client!dda", name = "e", descriptor = "(I)I")
	public final int method779() {
		return 1;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IB)V")
	public abstract void method780(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dda", name = "f", descriptor = "(I)Z")
	public final boolean method781() {
		return false;
	}

	@OriginalMember(owner = "client!dda", name = "h", descriptor = "(I)V")
	public abstract void method783();

	@OriginalMember(owner = "client!dda", name = "i", descriptor = "(I)Z")
	public abstract boolean method784();
}
