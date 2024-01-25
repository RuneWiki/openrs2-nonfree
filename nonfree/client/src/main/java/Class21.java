import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public abstract class Class21 {

	@OriginalMember(owner = "client!cj", name = "i", descriptor = "Lclient!wr;")
	protected final Class42_Sub1 aClass42_Sub1_19;

	static {
		new Class88("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
	}

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lclient!wr;)V")
	public Class21(@OriginalArg(0) Class42_Sub1 arg0) {
		this.aClass42_Sub1_19 = arg0;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!baa;II)V")
	public abstract void method7544(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
	public void method7545() {
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)V")
	public void method7546() {
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V")
	public void method7547() {
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZZ)V")
	public abstract void method7549(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(B)Z")
	public abstract boolean method7550();

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "(B)V")
	public void method7551() {
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IZ)V")
	public abstract void method7552(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "(I)V")
	public void method7554() {
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Z)V")
	public void method7555() {
	}

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "(B)V")
	public abstract void method7556();

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(III)V")
	public abstract void method7557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
