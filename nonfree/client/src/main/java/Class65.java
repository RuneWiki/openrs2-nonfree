import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class65 {

	@OriginalMember(owner = "client!f", name = "a", descriptor = "J")
	private long aLong55;

	@OriginalMember(owner = "client!f", name = "m", descriptor = "Lclient!ui;")
	private Class2_Sub9 aClass2_Sub9_7;

	@OriginalMember(owner = "client!f", name = "c", descriptor = "[Lclient!ui;")
	private final Class2_Sub9[] aClass2_Sub9Array1;

	@OriginalMember(owner = "client!f", name = "e", descriptor = "I")
	private final int anInt1644;

	static {
		new Class140("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
	}

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(I)V")
	public Class65(@OriginalArg(0) int arg0) {
		this.aClass2_Sub9Array1 = new Class2_Sub9[arg0];
		this.anInt1644 = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class2_Sub9 local20 = this.aClass2_Sub9Array1[local10] = new Class2_Sub9();
			local20.aClass2_Sub9_62 = local20;
			local20.aClass2_Sub9_61 = local20;
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I)Lclient!ui;")
	public Class2_Sub9 method1741() {
		if (this.aClass2_Sub9_7 == null) {
			return null;
		}
		@Pc(28) Class2_Sub9 local28 = this.aClass2_Sub9Array1[(int) (this.aLong55 & (long) (this.anInt1644 - 1))];
		while (local28 != this.aClass2_Sub9_7) {
			if (this.aClass2_Sub9_7.aLong211 == this.aLong55) {
				@Pc(44) Class2_Sub9 local44 = this.aClass2_Sub9_7;
				this.aClass2_Sub9_7 = this.aClass2_Sub9_7.aClass2_Sub9_61;
				return local44;
			}
			this.aClass2_Sub9_7 = this.aClass2_Sub9_7.aClass2_Sub9_61;
		}
		this.aClass2_Sub9_7 = null;
		return null;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(JLclient!ui;I)V")
	public void method1742(@OriginalArg(0) long arg0, @OriginalArg(1) Class2_Sub9 arg1) {
		if (arg1.aClass2_Sub9_62 != null) {
			arg1.method5600();
		}
		@Pc(21) Class2_Sub9 local21 = this.aClass2_Sub9Array1[(int) ((long) (this.anInt1644 - 1) & arg0)];
		arg1.aClass2_Sub9_62 = local21.aClass2_Sub9_62;
		arg1.aClass2_Sub9_61 = local21;
		arg1.aClass2_Sub9_62.aClass2_Sub9_61 = arg1;
		arg1.aClass2_Sub9_61.aClass2_Sub9_62 = arg1;
		arg1.aLong211 = arg0;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(JB)Lclient!ui;")
	public Class2_Sub9 method1746(@OriginalArg(0) long arg0) {
		this.aLong55 = arg0;
		@Pc(28) Class2_Sub9 local28 = this.aClass2_Sub9Array1[(int) (arg0 & (long) (this.anInt1644 - 1))];
		for (this.aClass2_Sub9_7 = local28.aClass2_Sub9_61; this.aClass2_Sub9_7 != local28; this.aClass2_Sub9_7 = this.aClass2_Sub9_7.aClass2_Sub9_61) {
			if (this.aClass2_Sub9_7.aLong211 == arg0) {
				@Pc(43) Class2_Sub9 local43 = this.aClass2_Sub9_7;
				this.aClass2_Sub9_7 = this.aClass2_Sub9_7.aClass2_Sub9_61;
				return local43;
			}
		}
		this.aClass2_Sub9_7 = null;
		return null;
	}
}
