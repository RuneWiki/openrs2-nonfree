import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public final class Class85_Sub1 extends Class85 {

	@OriginalMember(owner = "client!eo", name = "j", descriptor = "Z")
	private boolean aBoolean192;

	@OriginalMember(owner = "client!eo", name = "w", descriptor = "Z")
	private boolean aBoolean193;

	@OriginalMember(owner = "client!eo", name = "k", descriptor = "Lclient!nj;")
	private Class236 aClass236_2;

	@OriginalMember(owner = "client!eo", name = "y", descriptor = "Lclient!nj;")
	private Class236 aClass236_4;

	@OriginalMember(owner = "client!eo", name = "q", descriptor = "Lclient!nj;")
	private Class236 aClass236_3;

	@OriginalMember(owner = "client!eo", name = "i", descriptor = "Lclient!nj;")
	private Class236 aClass236_1;

	@OriginalMember(owner = "client!eo", name = "o", descriptor = "Lclient!cw;")
	private Class46_Sub2 aClass46_Sub2_3;

	@OriginalMember(owner = "client!eo", name = "x", descriptor = "Z")
	private final boolean aBoolean194;

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Lclient!lj;)V")
	public Class85_Sub1(@OriginalArg(0) Class78_Sub3 arg0) {
		super(arg0);
		if (super.aClass78_Sub3_37.aBoolean429) {
			this.aClass236_2 = Static297.method4407(super.aClass78_Sub3_37, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass236_4 = Static297.method4407(super.aClass78_Sub3_37, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass236_3 = Static297.method4407(super.aClass78_Sub3_37, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			this.aClass236_1 = Static297.method4407(super.aClass78_Sub3_37, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			if (this.aClass236_3 != null & this.aClass236_4 != null & this.aClass236_2 != null & this.aClass236_1 != null) {
				this.aClass46_Sub2_3 = new Class46_Sub2(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
				this.aClass46_Sub2_3.method5150(false, false);
				this.aBoolean194 = true;
			} else {
				this.aBoolean194 = false;
			}
		} else {
			this.aBoolean194 = false;
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6291() {
		return this.aBoolean194;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6294(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(BZ)V")
	@Override
	public void method6289(@OriginalArg(1) boolean arg0) {
		this.aBoolean192 = arg0;
		super.aClass78_Sub3_37.method4549(1);
		super.aClass78_Sub3_37.method4535(this.aClass46_Sub2_3);
		super.aClass78_Sub3_37.method4539(34165, 7681);
		super.aClass78_Sub3_37.method4493(34166, 0, 768);
		super.aClass78_Sub3_37.method4493(5890, 2, 770);
		super.aClass78_Sub3_37.method4527(0, 34168);
		super.aClass78_Sub3_37.method4549(0);
		this.method2215();
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)V")
	@Override
	public void method6287() {
		if (this.aBoolean193) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean193 = false;
		}
		super.aClass78_Sub3_37.method4549(1);
		super.aClass78_Sub3_37.method4535(null);
		super.aClass78_Sub3_37.method4539(8448, 8448);
		super.aClass78_Sub3_37.method4493(5890, 0, 768);
		super.aClass78_Sub3_37.method4493(34166, 2, 770);
		super.aClass78_Sub3_37.method4527(0, 5890);
		super.aClass78_Sub3_37.method4549(0);
		super.aClass78_Sub3_37.method4493(5890, 0, 768);
		super.aClass78_Sub3_37.method4527(0, 5890);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)V")
	public void method2215() {
		@Pc(7) Class34_Sub2 local7 = super.aClass78_Sub3_37.bf;
		if (this.aBoolean192) {
			OpenGL.glBindProgramARB(34336, super.aClass78_Sub3_37.anInt5577 == Integer.MAX_VALUE ? this.aClass236_4.anInt6426 : this.aClass236_1.anInt6426);
		} else {
			OpenGL.glBindProgramARB(34336, ~super.aClass78_Sub3_37.anInt5577 == Integer.MIN_VALUE ? this.aClass236_2.anInt6426 : this.aClass236_3.anInt6426);
		}
		local7.method976((float) 0, Static267.aFloatArray42, (float) super.aClass78_Sub3_37.anInt5577, -1.0F, 0.0F);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, Static267.aFloatArray42[0], Static267.aFloatArray42[1], Static267.aFloatArray42[2], Static267.aFloatArray42[3]);
		OpenGL.glEnable(34336);
		this.aBoolean193 = true;
		this.method2217();
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IILclient!vf;)V")
	@Override
	public void method6288(@OriginalArg(0) int arg0, @OriginalArg(2) Class46 arg1) {
		if (arg1 == null) {
			super.aClass78_Sub3_37.method4535(super.aClass78_Sub3_37.aClass46_Sub2_4);
			super.aClass78_Sub3_37.method4534(1);
			super.aClass78_Sub3_37.method4493(34168, 0, 768);
			super.aClass78_Sub3_37.method4527(0, 34168);
		} else {
			super.aClass78_Sub3_37.method4535(arg1);
			super.aClass78_Sub3_37.method4534(arg0);
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(III)V")
	@Override
	public void method6292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)V")
	public void method2217() {
		if (!this.aBoolean193) {
			return;
		}
		@Pc(16) int local16 = super.aClass78_Sub3_37.U();
		@Pc(20) int local20 = super.aClass78_Sub3_37.BA();
		@Pc(32) float local32 = -((float) (local16 - local20) * 0.125F) + (float) local16;
		@Pc(43) float local43 = (float) local16 - (float) (local16 - local20) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local43, local32, 1.0F / (float) super.aClass78_Sub3_37.anInt5595, (float) super.aClass78_Sub3_37.anInt5593 / 255.0F);
		super.aClass78_Sub3_37.method4549(1);
		super.aClass78_Sub3_37.method4491(super.aClass78_Sub3_37.anInt5598);
		super.aClass78_Sub3_37.method4549(0);
	}
}
