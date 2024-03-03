import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public final class Class2_Sub2_Sub10_Sub1 extends Class2_Sub2_Sub10 {

	@OriginalMember(owner = "client!jj", name = "R", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_68 = new Class79("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

	@OriginalMember(owner = "client!jj", name = "W", descriptor = "I")
	public static int anInt3082 = 0;

	@OriginalMember(owner = "client!jj", name = "U", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_116 = new Class145(34, -1);

	@OriginalMember(owner = "client!jj", name = "O", descriptor = "I")
	public int anInt3079;

	@OriginalMember(owner = "client!jj", name = "Q", descriptor = "B")
	public byte aByte27;

	@OriginalMember(owner = "client!jj", name = "T", descriptor = "Lclient!bt;")
	public Class2_Sub4 aClass2_Sub4_3;

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "(B)[B", line = 239)
	@Override
	public byte[] method5649() {
		if (super.aBoolean416 || this.aClass2_Sub4_3.anInt5289 < this.aClass2_Sub4_3.aByteArray73.length - this.aByte27) {
			throw new RuntimeException();
		}
		return this.aClass2_Sub4_3.aByteArray73;
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)I", line = 258)
	@Override
	public int method5652() {
		return this.aClass2_Sub4_3 == null ? 0 : this.aClass2_Sub4_3.anInt5289 * 100 / (this.aClass2_Sub4_3.aByteArray73.length - this.aByte27);
	}
}
