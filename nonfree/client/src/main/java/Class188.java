import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class188 {

	@OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
	public int anInt4987;

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "Lclient!af;")
	private final Class10 aClass10_27 = new Class10(64);

	@OriginalMember(owner = "client!kd", name = "n", descriptor = "Lclient!af;")
	public final Class10 aClass10_28 = new Class10(50);

	@OriginalMember(owner = "client!kd", name = "o", descriptor = "Lclient!af;")
	public final Class10 aClass10_29 = new Class10(5);

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "Lclient!ae;")
	public final Class8 aClass8_79;

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "Z")
	public boolean aBoolean323;

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "Lclient!ae;")
	private final Class8 aClass8_80;

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "Lclient!jk;")
	public final Class176 aClass176_3;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lclient!jk;IZLclient!ae;Lclient!ae;)V")
	public Class188(@OriginalArg(0) Class176 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class8 arg3, @OriginalArg(4) Class8 arg4) {
		this.aClass8_79 = arg4;
		this.aBoolean323 = arg2;
		this.aClass8_80 = arg3;
		this.aClass176_3 = arg0;
		if (this.aClass8_80 != null) {
			@Pc(41) int local41 = this.aClass8_80.method279() - 1;
			this.aClass8_80.method280(local41);
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)V")
	public void method4259(@OriginalArg(0) int arg0) {
		this.anInt4987 = arg0;
		@Pc(9) Class10 local9 = this.aClass10_28;
		synchronized (this.aClass10_28) {
			this.aClass10_28.method375();
		}
		local9 = this.aClass10_29;
		synchronized (this.aClass10_29) {
			this.aClass10_29.method375();
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
	public void method4260() {
		@Pc(2) Class10 local2 = this.aClass10_27;
		synchronized (this.aClass10_27) {
			this.aClass10_27.method380();
		}
		local2 = this.aClass10_28;
		synchronized (this.aClass10_28) {
			this.aClass10_28.method380();
		}
		local2 = this.aClass10_29;
		synchronized (this.aClass10_29) {
			this.aClass10_29.method380();
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BZ)V")
	public void method4261(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean323) {
			this.aBoolean323 = arg0;
			this.method4263();
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(II)Lclient!em;")
	public Class91 method4262(@OriginalArg(0) int arg0) {
		@Pc(6) Class10 local6 = this.aClass10_27;
		@Pc(18) Class91 local18;
		synchronized (this.aClass10_27) {
			local18 = (Class91) this.aClass10_27.method373((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class8 local31 = this.aClass8_80;
		@Pc(44) byte[] local44;
		synchronized (this.aClass8_80) {
			local44 = this.aClass8_80.method262(Static450.method8712(arg0), Static341.method8998(arg0));
		}
		local18 = new Class91();
		local18.aClass188_2 = this;
		local18.anInt2361 = arg0;
		if (local44 != null) {
			local18.method2034(new Class6_Sub23(local44));
		}
		local18.method2038();
		@Pc(81) Class10 local81 = this.aClass10_27;
		synchronized (this.aClass10_27) {
			this.aClass10_27.method366(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
	public void method4263() {
		@Pc(6) Class10 local6 = this.aClass10_27;
		synchronized (this.aClass10_27) {
			this.aClass10_27.method375();
		}
		local6 = this.aClass10_28;
		synchronized (this.aClass10_28) {
			this.aClass10_28.method375();
		}
		local6 = this.aClass10_29;
		synchronized (this.aClass10_29) {
			this.aClass10_29.method375();
		}
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(II)V")
	public void method4264() {
		@Pc(2) Class10 local2 = this.aClass10_27;
		synchronized (this.aClass10_27) {
			this.aClass10_27.method369(5);
		}
		local2 = this.aClass10_28;
		synchronized (this.aClass10_28) {
			this.aClass10_28.method369(5);
		}
		local2 = this.aClass10_29;
		synchronized (this.aClass10_29) {
			this.aClass10_29.method369(5);
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V")
	public void method4266() {
		@Pc(2) Class10 local2 = this.aClass10_28;
		synchronized (this.aClass10_28) {
			this.aClass10_28.method375();
		}
		local2 = this.aClass10_29;
		synchronized (this.aClass10_29) {
			this.aClass10_29.method375();
		}
	}
}
