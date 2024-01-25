import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class175 {

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
	public int anInt5265 = -1;

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
	public int anInt5267 = 8;

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
	public int anInt5263 = 0;

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
	public int anInt5268 = 128;

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
	public int anInt5270 = 16;

	@OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
	public int anInt5273 = -1;

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "Z")
	public boolean aBoolean435 = true;

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "Z")
	public boolean aBoolean436 = true;

	@OriginalMember(owner = "client!rc", name = "s", descriptor = "Z")
	public boolean aBoolean437 = false;

	@OriginalMember(owner = "client!rc", name = "r", descriptor = "I")
	public int anInt5274 = 1190717;

	@OriginalMember(owner = "client!rc", name = "t", descriptor = "I")
	public int anInt5275 = -1;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BI)V")
	public void method4566(@OriginalArg(1) int arg0) {
		this.anInt5267 = arg0 | this.anInt5267 << 8;
		if (this.anInt5265 == -1) {
			this.anInt5265 = this.anInt5275;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BIILclient!nj;)V")
	private void method4568(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub21 arg2) {
		if (arg0 == 1) {
			this.anInt5263 = Static201.method5726(arg2.method5705());
		} else if (arg0 == 2) {
			this.anInt5275 = arg2.method5720();
		} else if (arg0 == 3) {
			this.anInt5275 = arg2.method5715();
			if (this.anInt5275 == 65535) {
				this.anInt5275 = -1;
			}
		} else if (arg0 == 5) {
			this.aBoolean436 = false;
		} else if (arg0 == 7) {
			this.anInt5273 = Static201.method5726(arg2.method5705());
		} else if (arg0 == 8) {
			Static159.anInt6380 = arg1;
		} else if (arg0 == 9) {
			this.anInt5268 = arg2.method5715();
		} else if (arg0 == 10) {
			this.aBoolean435 = false;
		} else if (arg0 == 11) {
			this.anInt5267 = arg2.method5720();
		} else if (arg0 == 12) {
			this.aBoolean437 = true;
		} else if (arg0 == 13) {
			this.anInt5274 = arg2.method5705();
		} else if (arg0 == 14) {
			this.anInt5270 = arg2.method5720();
		} else if (arg0 == 15) {
			this.anInt5265 = arg2.method5715();
			if (this.anInt5265 == 65535) {
				this.anInt5265 = -1;
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!nj;B)V")
	public void method4571(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub21 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method5720();
			if (local5 == 0) {
				return;
			}
			this.method4568(local5, arg0, arg1);
		}
	}
}
