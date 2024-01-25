import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!up")
public final class Class1_Sub41 extends Class1 {

	@OriginalMember(owner = "client!up", name = "p", descriptor = "I")
	public int anInt6210;

	@OriginalMember(owner = "client!up", name = "q", descriptor = "I")
	public int anInt6211;

	@OriginalMember(owner = "client!up", name = "t", descriptor = "I")
	public int anInt6214;

	@OriginalMember(owner = "client!up", name = "u", descriptor = "I")
	public int anInt6215;

	@OriginalMember(owner = "client!up", name = "v", descriptor = "I")
	public int anInt6216;

	@OriginalMember(owner = "client!up", name = "w", descriptor = "I")
	public int anInt6217;

	@OriginalMember(owner = "client!up", name = "A", descriptor = "I")
	public int anInt6221;

	@OriginalMember(owner = "client!up", name = "C", descriptor = "I")
	public int anInt6223;

	@OriginalMember(owner = "client!up", name = "F", descriptor = "I")
	public int anInt6226;

	@OriginalMember(owner = "client!up", name = "G", descriptor = "I")
	public int anInt6227;

	@OriginalMember(owner = "client!up", name = "H", descriptor = "I")
	public int anInt6228;

	@OriginalMember(owner = "client!up", name = "K", descriptor = "I")
	public int anInt6230;

	@OriginalMember(owner = "client!up", name = "L", descriptor = "I")
	public int anInt6231;

	@OriginalMember(owner = "client!up", name = "M", descriptor = "I")
	public int anInt6232;

	@OriginalMember(owner = "client!up", name = "N", descriptor = "I")
	public int anInt6233;

	static {
		new Class106("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(ILclient!fp;B)Lclient!bi;")
	public Class3 method5565(@OriginalArg(0) int arg0, @OriginalArg(1) Class63 arg1) {
		@Pc(14) int local14 = Static253.anIntArray397[this.anInt6215];
		if (local14 == 0) {
			@Pc(123) Class11_Sub5 local123 = Static342.method5727(this.anInt6231, this.anInt6227, this.anInt6233);
			if (local123 instanceof Class11_Sub5_Sub2) {
				@Pc(129) Class11_Sub5_Sub2 local129 = (Class11_Sub5_Sub2) local123;
				if (local129.aClass11_Sub5_3 != null) {
					return ((Interface4) local129.aClass11_Sub5_3).method5921(arg1, arg0);
				}
			}
		} else if (local14 == 1) {
			@Pc(32) Class11_Sub4 local32 = Static74.method1619(this.anInt6231, this.anInt6227, this.anInt6233);
			if (local32 instanceof Class11_Sub4_Sub1) {
				@Pc(38) Class11_Sub4_Sub1 local38 = (Class11_Sub4_Sub1) local32;
				if (local38.aClass11_Sub4_3 != null) {
					return ((Interface4) local38.aClass11_Sub4_3).method5921(arg1, arg0);
				}
			}
		} else if (local14 == 2) {
			@Pc(70) Class11_Sub2 local70 = Static138.method2791(this.anInt6231, this.anInt6227, this.anInt6233, jb.class);
			if (local70 instanceof Class11_Sub2_Sub1) {
				@Pc(76) Class11_Sub2_Sub1 local76 = (Class11_Sub2_Sub1) local70;
				if (local76.aClass11_Sub2_1 != null) {
					return ((Interface4) local76.aClass11_Sub2_1).method5921(arg1, arg0);
				}
			}
		} else if (local14 == 3) {
			@Pc(98) Class11_Sub1 local98 = Static109.method2324(this.anInt6231, this.anInt6227, this.anInt6233);
			if (local98 instanceof Class11_Sub1_Sub1) {
				@Pc(104) Class11_Sub1_Sub1 local104 = (Class11_Sub1_Sub1) local98;
				if (local104.aClass11_Sub1_1 != null) {
					return ((Interface4) local104.aClass11_Sub1_1).method5921(arg1, arg0);
				}
			}
		}
		return null;
	}
}
