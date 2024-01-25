import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class32 {

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "I")
	public int anInt907 = 0;

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "I")
	public int anInt909 = 0;

	@OriginalMember(owner = "client!bo", name = "e", descriptor = "Lclient!wg;")
	private final Class313 aClass313_4 = new Class313(64);

	@OriginalMember(owner = "client!bo", name = "p", descriptor = "Lclient!uc;")
	private Interface17 anInterface17_1 = null;

	@OriginalMember(owner = "client!bo", name = "g", descriptor = "Lclient!kr;")
	private final Class171 aClass171_22;

	@OriginalMember(owner = "client!bo", name = "o", descriptor = "Lclient!kr;")
	private final Class171 aClass171_23;

	static {
		new Class306("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");
	}

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(ILclient!kr;Lclient!kr;Lclient!uc;)V")
	public Class32(@OriginalArg(0) int arg0, @OriginalArg(1) Class171 arg1, @OriginalArg(2) Class171 arg2, @OriginalArg(3) Interface17 arg3) {
		this.anInterface17_1 = arg3;
		this.aClass171_22 = arg2;
		this.aClass171_23 = arg1;
		if (this.aClass171_23 != null) {
			this.anInt907 = this.aClass171_23.method4349(1);
		}
		if (this.aClass171_22 != null) {
			this.anInt909 = this.aClass171_22.method4349(1);
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)Lclient!lda;")
	public Class1_Sub1_Sub10 method922(@OriginalArg(0) int arg0) {
		@Pc(18) Class1_Sub1_Sub10 local18 = (Class1_Sub1_Sub10) this.aClass313_4.method7406((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(34) byte[] local34;
		if (arg0 < 32768) {
			local34 = this.aClass171_23.method4339(1, arg0);
		} else {
			local34 = this.aClass171_22.method4339(1, arg0 & 0x7FFF);
		}
		local18 = new Class1_Sub1_Sub10();
		local18.aClass32_1 = this;
		if (local34 != null) {
			local18.method4438(new Class1_Sub6(local34));
		}
		if (arg0 >= 32768) {
			local18.method4436();
		}
		this.aClass313_4.method7399((long) arg0, local18);
		return local18;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!bn;[IJB)Ljava/lang/String;")
	public String method923(@OriginalArg(0) Class31 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) long arg2) {
		if (this.anInterface17_1 != null) {
			@Pc(22) String local22 = this.anInterface17_1.method4614(arg0, arg2, arg1);
			if (local22 != null) {
				return local22;
			}
		}
		return Long.toString(arg2);
	}
}
