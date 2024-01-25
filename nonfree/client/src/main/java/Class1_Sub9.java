import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public abstract class Class1_Sub9 extends Class1 {

	@OriginalMember(owner = "client!pb", name = "k", descriptor = "Z")
	public boolean aBoolean31;

	@OriginalMember(owner = "client!pb", name = "q", descriptor = "Lclient!kd;")
	protected final Class39_Sub2 aClass39_Sub2_7;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lclient!kd;)V")
	public Class1_Sub9(@OriginalArg(0) Class39_Sub2 arg0) {
		this.aClass39_Sub2_7 = arg0;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)I")
	public final int method640() {
		return 1;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)V")
	public abstract void method642(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)Z")
	public final boolean method643() {
		return false;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)Z")
	public abstract boolean method644();

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)V")
	public abstract void method645(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!fo;IILclient!fo;)V")
	public abstract void method646(@OriginalArg(0) Class3_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub2 arg2);

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
	public abstract void method647();

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "(I)Z")
	public final boolean method649() {
		return this.aBoolean31;
	}

	@OriginalMember(owner = "client!pb", name = "i", descriptor = "(I)Z")
	public abstract boolean method650();

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(Z)I")
	public int method651() {
		return 0;
	}
}
