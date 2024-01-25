import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public abstract class Class70 {

	@OriginalMember(owner = "client!rda", name = "m", descriptor = "Lclient!nd;")
	protected final Class62_Sub1 aClass62_Sub1_20;

	@OriginalMember(owner = "client!rda", name = "<init>", descriptor = "(Lclient!nd;)V")
	public Class70(@OriginalArg(0) Class62_Sub1 arg0) {
		this.aClass62_Sub1_20 = arg0;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(B)V")
	public void method7299() {
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(ZII)V")
	public abstract void method7300(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(I)Z")
	public abstract boolean method7301();

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(ZI)V")
	public abstract void method7303(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(I)V")
	public void method7304() {
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(B)V")
	public abstract void method7306();

	@OriginalMember(owner = "client!rda", name = "c", descriptor = "(I)V")
	public void method7307() {
	}

	@OriginalMember(owner = "client!rda", name = "d", descriptor = "(I)V")
	public void method7308() {
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(ZB)V")
	public abstract void method7311(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!rda", name = "d", descriptor = "(B)V")
	public void method7312() {
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IILclient!qv;)V")
	public abstract void method7313(@OriginalArg(1) int arg0, @OriginalArg(2) Interface12 arg1);

	@OriginalMember(owner = "client!rda", name = "e", descriptor = "(I)V")
	public void method7314() {
	}
}
