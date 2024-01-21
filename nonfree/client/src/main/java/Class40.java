import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!t")
public final class Class40 {

	@OriginalMember(owner = "client!t", name = "d", descriptor = "I")
	private static int anInt939 = 855;

	@OriginalMember(owner = "client!t", name = "e", descriptor = "I")
	private int anInt940;

	@OriginalMember(owner = "client!t", name = "f", descriptor = "I")
	private int anInt941;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "Z")
	private boolean aBoolean209 = false;

	@OriginalMember(owner = "client!t", name = "b", descriptor = "Z")
	private boolean aBoolean210 = false;

	@OriginalMember(owner = "client!t", name = "c", descriptor = "I")
	private int anInt938 = -5797;

	@OriginalMember(owner = "client!t", name = "g", descriptor = "Lclient!x;")
	private Class1_Sub1 aClass1_Sub1_37 = new Class1_Sub1();

	@OriginalMember(owner = "client!t", name = "j", descriptor = "Lclient!u;")
	private Class42 aClass42_1 = new Class42(1024, 0);

	@OriginalMember(owner = "client!t", name = "k", descriptor = "Lclient!qb;")
	private Class34 aClass34_1 = new Class34(anInt939);

	@OriginalMember(owner = "client!t", name = "h", descriptor = "I")
	private int anInt942;

	@OriginalMember(owner = "client!t", name = "i", descriptor = "I")
	private int anInt943;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(IB)V")
	public Class40(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(33) boolean local33 = false;
			this.anInt942 = arg0;
			this.anInt943 = arg0;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("88550, " + arg0 + ", " + arg1 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(J)Lclient!x;")
	public Class1_Sub1 method637(@OriginalArg(0) long arg0) {
		@Pc(5) Class1_Sub1 local5 = (Class1_Sub1) this.aClass42_1.method640(arg0);
		if (local5 == null) {
			this.anInt940++;
		} else {
			this.aClass34_1.method531(local5);
			this.anInt941++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ZLclient!x;J)V")
	public void method638(@OriginalArg(1) Class1_Sub1 arg0, @OriginalArg(2) long arg1) {
		try {
			if (this.anInt943 == 0) {
				@Pc(6) Class1_Sub1 local6 = this.aClass34_1.method532();
				local6.method665();
				local6.method513();
				if (local6 == this.aClass1_Sub1_37) {
					local6 = this.aClass34_1.method532();
					local6.method665();
					local6.method513();
				}
			} else {
				this.anInt943--;
			}
			this.aClass42_1.method641(arg0, this.anInt938, arg1);
			this.aClass34_1.method531(arg0);
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("26553, " + false + ", " + arg0 + ", " + arg1 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "()V")
	public void method639() {
		while (true) {
			@Pc(3) Class1_Sub1 local3 = this.aClass34_1.method532();
			if (local3 == null) {
				this.anInt943 = this.anInt942;
				return;
			}
			local3.method665();
			local3.method513();
		}
	}
}
