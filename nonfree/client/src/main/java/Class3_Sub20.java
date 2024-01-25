import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public abstract class Class3_Sub20 extends Class3 {

	@OriginalMember(owner = "client!f", name = "p", descriptor = "Z")
	public boolean aBoolean635;

	@OriginalMember(owner = "client!f", name = "i", descriptor = "Lclient!kw;")
	protected final Class5_Sub2 aClass5_Sub2_33;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lclient!kw;)V")
	public Class3_Sub20(@OriginalArg(0) Class5_Sub2 arg0) {
		this.aClass5_Sub2_33 = arg0;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(B)Z")
	public abstract boolean method7670();

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(III)V")
	public abstract void method7672(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ILclient!ol;Lclient!ol;I)V")
	public abstract void method7675(@OriginalArg(0) int arg0, @OriginalArg(1) Class76_Sub3 arg1, @OriginalArg(2) Class76_Sub3 arg2);

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I)Z")
	public final boolean method7676() {
		return this.aBoolean635;
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V")
	public abstract void method7677();

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(I)Z")
	public abstract boolean method7678();

	@OriginalMember(owner = "client!f", name = "d", descriptor = "(I)I")
	public int method7680() {
		return 0;
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(II)V")
	public abstract void method7681(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!f", name = "d", descriptor = "(B)Z")
	public final boolean method7682() {
		return false;
	}

	@OriginalMember(owner = "client!f", name = "e", descriptor = "(I)I")
	public final int method7683() {
		return 1;
	}
}
