import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public abstract class Class2_Sub13 extends Class2 {

	@OriginalMember(owner = "client!ef", name = "q", descriptor = "Z")
	public boolean aBoolean105;

	@OriginalMember(owner = "client!ef", name = "r", descriptor = "Lclient!fu;")
	protected final Class63_Sub2 aClass63_Sub2_12;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lclient!fu;)V")
	public Class2_Sub13(@OriginalArg(0) Class63_Sub2 arg0) {
		this.aClass63_Sub2_12 = arg0;
	}

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "(I)Z")
	public final boolean method1183() {
		return this.aBoolean105;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "()Z")
	public abstract boolean method1184();

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "()Z")
	public abstract boolean method1185();

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)V")
	public abstract void method1186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILclient!uo;Lclient!uo;)V")
	public abstract void method1187(@OriginalArg(0) int arg0, @OriginalArg(1) Class20_Sub4 arg1, @OriginalArg(2) Class20_Sub4 arg2);

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "()V")
	public abstract void method1188();

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "(I)V")
	public abstract void method1189(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "(I)I")
	public final int method1190() {
		return 1;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)Z")
	public final boolean method1191() {
		return false;
	}

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "()I")
	public int method1192() {
		return 0;
	}
}
