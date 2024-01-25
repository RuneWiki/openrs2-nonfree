import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class231 {

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "Lclient!vi;")
	private final Class248 aClass248_8 = new Class248();

	@OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
	private int anInt6885;

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
	private final int anInt6877;

	@OriginalMember(owner = "client!ua", name = "k", descriptor = "Lclient!jr;")
	private final Class127 aClass127_32;

	static {
		new Class175("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
	}

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(I)V")
	public Class231(@OriginalArg(0) int arg0) {
		this.anInt6885 = arg0;
		this.anInt6877 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.aClass127_32 = new Class127(local16);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)I")
	public int method5351() {
		return this.anInt6877;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!qq;I)V")
	private void method5352(@OriginalArg(0) Class3_Sub3_Sub1 arg0) {
		if (arg0 != null) {
			arg0.method5987();
			arg0.method4647();
			this.anInt6885 += arg0.anInt5653;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ljava/lang/Object;Lclient!s;II)V")
	private void method5353(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface11 arg1) {
		if (this.anInt6877 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method5354(arg1);
		this.anInt6885--;
		while (this.anInt6885 < 0) {
			@Pc(29) Class3_Sub3_Sub1 local29 = (Class3_Sub3_Sub1) this.aClass248_8.method5662();
			this.method5352(local29);
		}
		@Pc(45) Class3_Sub3_Sub1_Sub1 local45 = new Class3_Sub3_Sub1_Sub1(arg1, arg0, 1);
		this.aClass127_32.method3257(arg1.method3376(), local45);
		this.aClass248_8.method5659(local45);
		local45.aLong175 = 0;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!s;I)V")
	private void method5354(@OriginalArg(0) Interface11 arg0) {
		@Pc(7) long local7 = arg0.method3376();
		for (@Pc(14) Class3_Sub3_Sub1 local14 = (Class3_Sub3_Sub1) this.aClass127_32.method3246(local7); local14 != null; local14 = (Class3_Sub3_Sub1) this.aClass127_32.method3254()) {
			if (local14.anInterface11_3.method3375(arg0)) {
				this.method5352(local14);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)I")
	public int method5356() {
		return this.anInt6885;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!s;Ljava/lang/Object;I)V")
	public void method5357(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) Object arg1) {
		this.method5353(arg1, arg0);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILclient!s;)Ljava/lang/Object;")
	public Object method5358(@OriginalArg(1) Interface11 arg0) {
		@Pc(7) long local7 = arg0.method3376();
		for (@Pc(20) Class3_Sub3_Sub1 local20 = (Class3_Sub3_Sub1) this.aClass127_32.method3246(local7); local20 != null; local20 = (Class3_Sub3_Sub1) this.aClass127_32.method3254()) {
			if (local20.anInterface11_3.method3375(arg0)) {
				@Pc(33) Object local33 = local20.method4560();
				if (local33 != null) {
					if (local20.method4558()) {
						@Pc(72) Class3_Sub3_Sub1_Sub1 local72 = new Class3_Sub3_Sub1_Sub1(arg0, local33, local20.anInt5653);
						this.aClass127_32.method3257(local20.aLong227, local72);
						this.aClass248_8.method5659(local72);
						local72.aLong175 = 0L;
						local20.method5987();
						local20.method4647();
					} else {
						this.aClass248_8.method5659(local20);
						local20.aLong175 = 0L;
					}
					return local33;
				}
				local20.method5987();
				local20.method4647();
				this.anInt6885 += local20.anInt5653;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)V")
	public void method5359() {
		if (Static62.aClass111_1 == null) {
			return;
		}
		for (@Pc(11) Class3_Sub3_Sub1 local11 = (Class3_Sub3_Sub1) this.aClass248_8.method5661(); local11 != null; local11 = (Class3_Sub3_Sub1) this.aClass248_8.method5657()) {
			if (local11.method4558()) {
				if (local11.method4560() == null) {
					local11.method5987();
					local11.method4647();
					this.anInt6885 += local11.anInt5653;
				}
			} else if ((long) 5 < ++local11.aLong175) {
				@Pc(56) Class3_Sub3_Sub1 local56 = Static62.aClass111_1.method3707(local11);
				this.aClass127_32.method3257(local11.aLong227, local56);
				Static180.method3065(local56, local11);
				local11.method5987();
				local11.method4647();
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)V")
	public void method5360() {
		this.aClass248_8.method5663();
		this.aClass127_32.method3249();
		this.anInt6885 = this.anInt6877;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
	public void method5361() {
		for (@Pc(5) Class3_Sub3_Sub1 local5 = (Class3_Sub3_Sub1) this.aClass248_8.method5661(); local5 != null; local5 = (Class3_Sub3_Sub1) this.aClass248_8.method5657()) {
			if (local5.method4558()) {
				local5.method5987();
				local5.method4647();
				this.anInt6885 += local5.anInt5653;
			}
		}
	}
}
