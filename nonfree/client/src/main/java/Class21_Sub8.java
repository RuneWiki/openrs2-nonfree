import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class21_Sub8 extends Class21 {

	@OriginalMember(owner = "client!uc", name = "l", descriptor = "Z")
	private boolean aBoolean620 = false;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lclient!wr;)V")
	public Class21_Sub8(@OriginalArg(0) Class42_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7550() {
		return true;
	}

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "(B)V")
	@Override
	public void method7556() {
		if (this.aBoolean620) {
			super.aClass42_Sub1_19.method5915(1);
			super.aClass42_Sub1_19.method5972(Static166.aClass301_3);
			super.aClass42_Sub1_19.method5945(Static506.aClass129_5, Static506.aClass129_5);
			super.aClass42_Sub1_19.method5951(Static371.aClass302_2, 2);
			super.aClass42_Sub1_19.method5967(0, Static159.aClass302_1);
			super.aClass42_Sub1_19.method5966();
			super.aClass42_Sub1_19.method5868(null);
			super.aClass42_Sub1_19.method5915(0);
			this.aBoolean620 = false;
		} else {
			super.aClass42_Sub1_19.method5967(0, Static159.aClass302_1);
		}
		super.aClass42_Sub1_19.method5945(Static506.aClass129_5, Static506.aClass129_5);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7552(@OriginalArg(1) boolean arg0) {
		super.aClass42_Sub1_19.method5945(Static191.aClass129_3, Static506.aClass129_5);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!baa;II)V")
	@Override
	public void method7544(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) int arg1) {
		super.aClass42_Sub1_19.method5868(arg0);
		super.aClass42_Sub1_19.method5979(arg1);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7549(@OriginalArg(0) boolean arg0) {
		@Pc(8) Interface8 local8 = super.aClass42_Sub1_19.method5982();
		if (local8 == null || !arg0) {
			super.aClass42_Sub1_19.method5967(0, Static388.aClass302_3);
			return;
		}
		super.aClass42_Sub1_19.method5915(1);
		super.aClass42_Sub1_19.method5868(local8);
		super.aClass42_Sub1_19.method5972(Static230.aClass301_4);
		super.aClass42_Sub1_19.method5915(1);
		super.aClass42_Sub1_19.method5945(Static191.aClass129_3, Static159.aClass129_2);
		super.aClass42_Sub1_19.method5983(true, false, 2, Static499.aClass302_4);
		super.aClass42_Sub1_19.method5967(0, Static388.aClass302_3);
		@Pc(65) Class91_Sub2 local65 = super.aClass42_Sub1_19.method5903();
		local65.method5496(super.aClass42_Sub1_19.method5987());
		super.aClass42_Sub1_19.method5918(Static365.aClass299_4);
		super.aClass42_Sub1_19.method5915(0);
		this.aBoolean620 = true;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)V")
	@Override
	public void method7557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
